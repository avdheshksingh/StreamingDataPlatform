package com.mtss.sdp.streamingserver.services.exceptions;

public class NullValueException extends Exception {

	private static final long serialVersionUID = 1L;

	public NullValueException() {
		super();
	}
	
    public NullValueException(String message) {
        super(message);
    }
    
    public NullValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
