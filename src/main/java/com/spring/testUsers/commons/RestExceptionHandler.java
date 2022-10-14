package com.spring.testUsers.commons;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.spring.testUsers.entities.UserErrorResponse;

@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(EntityNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public UserErrorResponse handleEntityNotFoundException(EntityNotFoundException ex) {
		UserErrorResponse response = new UserErrorResponse(ex.getMessage());
        return response;
    }
	 

}
