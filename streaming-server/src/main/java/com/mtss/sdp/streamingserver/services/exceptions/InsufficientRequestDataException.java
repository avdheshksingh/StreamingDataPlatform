package com.mtss.sdp.streamingserver.services.exceptions;

public class InsufficientRequestDataException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientRequestDataException() {
		super();
	}
	
    public InsufficientRequestDataException(String message) {
        super(message);
    }
    
    public InsufficientRequestDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
