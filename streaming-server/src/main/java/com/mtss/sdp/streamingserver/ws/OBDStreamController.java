package com.mtss.sdp.streamingserver.ws;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mtss.sdp.sensordata.model.SensorData;
import com.mtss.sdp.streamingserver.services.KafkaBroker;
import com.mtss.sdp.streamingserver.services.SchemaValidationService;
import com.mtss.sdp.streamingserver.services.exceptions.SchemaValidationException;

@RestController
@RequestMapping("spd")
public class OBDStreamController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OBDStreamController.class);

    @Autowired
    private KafkaBroker broker;
	    
    @Autowired
    private SchemaValidationService schemaValidationService;
    
    @PostMapping(path="/stream/v1/event", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String  createSensorData(
    		@RequestBody SensorData sensorData,
    		@RequestHeader("X-Tenant-ID") String tenantId,
    		@RequestHeader("X-Event-ID") String eventId
    		) {
    	LOGGER.info("Sensor data received at REST endpoint: "+sensorData);
    	
    	String response = "";
    	try {
    		
    		if(Objects.nonNull(sensorData) && 
 			    (Objects.nonNull(sensorData.getAccelerometerData()) || 
			     Objects.nonNull(sensorData.getGPSData()) ||
			     Objects.nonNull(sensorData.getOBDData())
			    )) {
			    
    			// check Event against Schema, if valid then forward for processing, else LOG and ignore

				if(schemaValidationService.validateEventSchema(tenantId, eventId, sensorData)){
					
					// send to message broker
					response = broker.sendToBroker(tenantId, eventId, sensorData);
					LOGGER.debug("Sensor Data send to Broker, response: "+response);
					
				} else {
					LOGGER.info("Device is NOT Active, no need to record Sensor Data");    
				}				
	    	}else {
	    		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No Sensor data in Request");
	    	}

    	}catch(SchemaValidationException exception) {
    		LOGGER.error(exception.getMessage(), exception);
    		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Bad Sensor data in Request");    		
    	}catch(ResponseStatusException exception) {
    		LOGGER.error("ResponseStatusException  while sending Sensor Data to broker -", exception);
   		 	throw exception;
    	}catch(Exception exception) {
    		LOGGER.error("Error while sending Sensor Data to broker", exception);
    		 throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
    	}

        return response;
    }
}
