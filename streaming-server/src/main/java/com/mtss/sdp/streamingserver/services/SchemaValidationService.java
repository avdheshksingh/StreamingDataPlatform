package com.mtss.sdp.streamingserver.services;

import java.util.Objects;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtss.sdp.sensordata.model.SensorData;
import com.mtss.sdp.streamingserver.services.exceptions.InvalidDataException;
import com.mtss.sdp.streamingserver.services.exceptions.SchemaValidationException;
import com.networknt.schema.InputFormat;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SchemaValidatorsConfig;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SchemaValidationService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SchemaValidationService.class);

    @Autowired
    private TenantDBService tenantDBService;

	public Boolean validateEventSchema(String tenantId, String eventId, SensorData eventObject) throws SchemaValidationException {
		Boolean isJSONValid = false;
		
		try {
			// Load JSON Schema from Database
			String eventSchema = tenantDBService.findSchemaByTenantAndEvent(tenantId, eventId);
					
			// check if schema found in DB
			if (Objects.isNull(eventSchema)) {
				// not found, don't proceed
				LOGGER.error("Event Schema not found for "+tenantId+" "+eventId);
				throw new InvalidDataException("Event Schema not found for "+tenantId+" "+eventId);
			}
			
			// convert Event Obj to String JSON
			String event = sensorDataToJSONString(eventObject);
			
			// Run validation
			Set<ValidationMessage> assertions = validate(event, eventSchema);
			
			// check if any error
			if (assertions.isEmpty()) {
				isJSONValid = true;
				LOGGER.info("Valid Event "+tenantId+" "+eventId);
			} else {
				isJSONValid = false;
				LOGGER.info("Invalid Event for "+tenantId+" "+eventId+": "+event);            
			}
		}catch(Exception exception) {
			throw new SchemaValidationException(exception.getMessage(), exception);
		}
		
		return isJSONValid;
	}

	private String sensorDataToJSONString(SensorData eventObject) throws InvalidDataException {
		String jsonString = "";
		
        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Convert object to JSON string
            jsonString = objectMapper.writeValueAsString(eventObject);
            
        } catch (JsonProcessingException e) {
           throw new InvalidDataException("Error while converting Event Object to String JSON", e);
        }
		
		return jsonString;
	}
	
	/*
	 * 	Validation process using networknt.json-schema-validator library
	 * 
	 */
	private Set<ValidationMessage> validate(String event, String eventSchema) throws InvalidDataException {
		Set<ValidationMessage> assertions = null;
		
		try {
			
			JsonSchemaFactory jsonSchemaFactory  = JsonSchemaFactory.getInstance(VersionFlag.V202012);
			
			SchemaValidatorsConfig.Builder builder = SchemaValidatorsConfig.builder();
			SchemaValidatorsConfig config = builder.build();
			
			JsonSchema jsonSchema = jsonSchemaFactory.getSchema(eventSchema, config);
			
			// validate event JSON with schema
			assertions = jsonSchema.validate(event, InputFormat.JSON, executionContext -> {
				executionContext.getExecutionConfig().setFormatAssertionsEnabled(true);
			});
		}catch (Exception e) {
			throw new InvalidDataException("Error in validating JSON schema", e);
		}
		
		return assertions;
	}
	 
}
