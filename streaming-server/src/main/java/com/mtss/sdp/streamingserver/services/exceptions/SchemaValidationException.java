package com.mtss.sdp.streamingserver.services.exceptions;

public class SchemaValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	public SchemaValidationException() {
		super();
	}
	
    public SchemaValidationException(String message) {
        super(message);
    }
    
    public SchemaValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
