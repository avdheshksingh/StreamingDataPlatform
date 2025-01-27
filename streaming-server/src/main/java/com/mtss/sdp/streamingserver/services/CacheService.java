package com.mtss.sdp.streamingserver.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CacheService.class);

//	@Autowired
//  private EventSchemaRepository eventSchemaRepository;
	
	/*
	 * Get from cache
	 */
	public String getSchema(String tenantId, String eventId) {
		
		String jsonSchema = null;
		
		// TODO retrieve from cache, return NULL if not found
		// jsonSchema = findSchema(tenantId, eventId);
			
		return jsonSchema;		
	}

	/*
	 * Save in cache
	 */
	public void setSchema(String tenantId, String eventId, String jsonSchema) {
		
		// TODO : save jsonSchema in cache
		
		return;
	}	
}
