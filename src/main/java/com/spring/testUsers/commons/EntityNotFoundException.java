package com.spring.testUsers.commons;

public class EntityNotFoundException extends RuntimeException{
	
	private int errorCode;
    private String errorMessage;

    public EntityNotFoundException(String message) {
		super(message);
    }
    
    public EntityNotFoundException(String message, int errorCode) {
		super();
        this.setErrorCode(errorCode);
        this.errorMessage = message;
    }
	
	public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	@Override
    public String toString() {
        return "error : " + this.getErrorMessage();
    }
	
}
