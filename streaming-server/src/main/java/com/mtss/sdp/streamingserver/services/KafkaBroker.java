package com.mtss.sdp.streamingserver.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.mtss.sdp.sensordata.model.SensorData;
import com.mtss.sdp.streamingserver.services.exceptions.NullValueException;

@Service
public final class KafkaBroker {
	
	private final String SUCCESS = "OK";
	private final String FAILED = "ERROR";
	
	@Value("${kafka.topic.name}")
	private String kafkaTopicName;
	
    @Autowired
    private KafkaTemplate<String, SensorData> kafkaTemplate;
    
    public String sendToBroker(String tenantId, String eventId, SensorData sensorData) {
    	String resp = "";
    	
    	try {
    		
    		if(Objects.isNull(tenantId)  || Objects.isNull(eventId)) {
    			throw new NullValueException("tenantId or eventId is NULL");
    		}
    		
    		// send to Message Broker
        	kafkaTemplate.send(kafkaTopicName, sensorData);
        	
        	// Success response
        	resp = SUCCESS;
        	
    	}catch(Exception exception) {
    		resp = FAILED+":"+exception.getMessage();
    	}
    	
    	return resp;
    }
}
