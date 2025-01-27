package com.mtss.sdp.streamingserver.services;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtss.sdp.streamingserver.entity.EventSchemaEntity;
import com.mtss.sdp.streamingserver.entity.EventSchemaKey;
import com.mtss.sdp.streamingserver.repository.EventSchemaRepository;

@Service
public class TenantDBService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TenantDBService.class);

	@Autowired
    private EventSchemaRepository eventSchemaRepository;
	
	@Autowired
	private CacheService cacheService;
    
	public String findSchemaByTenantAndEvent(String tenantId, String eventId) {
		/*
		 * Cache- Redis
		 * Caching mode- Cache-Aside
		 * 
		 * get schema from Redis Cache first, if not available in cache-
		 * 		retrieve from DB
		 * 		push in cache
		 * 		return schema to caller
		 */
		
		String jsonSchema = cacheService.getSchema(tenantId, eventId);
		if(Objects.isNull(jsonSchema)) {
			
			// retrieve from DB
			jsonSchema = findSchema(tenantId, eventId);
			
			// save in cache
			// TODO
			
		}
		
		return jsonSchema;
	}

	private String findSchema(String tenantId, String eventId) {
		
		String jsonSchema = null;
		
		try {
			EventSchemaKey key = new EventSchemaKey(tenantId, eventId);
			
			Optional<EventSchemaEntity> eventSchema = eventSchemaRepository.findById(key);
			jsonSchema = eventSchema.get().getJsonSchema();
		
		}catch (NoSuchElementException e) {
			LOGGER.error(e.getMessage(), e);			
		}
		
		return jsonSchema;
	}
	
}
