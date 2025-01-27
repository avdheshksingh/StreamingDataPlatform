package com.mtss.sdp.streamingserver.entity;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("EventSchema")
public class EventSchemaEntity {
	
	@PrimaryKey
	private EventSchemaKey key;

	private String jsonSchema;

	public EventSchemaKey getKey() {
		return key;
	}

	public void setKey(EventSchemaKey key) {
		this.key = key;
	}

	public String getJsonSchema() {
		return jsonSchema;
	}

	public void setJsonSchema(String jsonSchema) {
		this.jsonSchema = jsonSchema;
	}
}
