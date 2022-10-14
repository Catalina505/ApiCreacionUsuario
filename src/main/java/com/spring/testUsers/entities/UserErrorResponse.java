package com.spring.testUsers.entities;

public class UserErrorResponse {
	
	private String error;

    public UserErrorResponse() {

    }

    public UserErrorResponse(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
