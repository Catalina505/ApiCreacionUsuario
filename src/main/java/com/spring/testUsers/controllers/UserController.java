package com.spring.testUsers.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.testUsers.commons.EntityBadRequestException;
import com.spring.testUsers.entities.User;
import com.spring.testUsers.services.UserService;

@RestController
public class UserController {
	
	private final UserService userService;
	
	@PostMapping(value="/register", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity saveUser(@Valid @RequestBody User user) throws Exception{
		System.out.print(user);
		
		try {
			return new ResponseEntity(userService.saveUser(user), HttpStatus.CREATED);
			//return null;
		} catch (EntityBadRequestException e) {
			throw e;
		}
		
	}
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
}
