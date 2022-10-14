package com.spring.testUsers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.testUsers.commons.EntityBadRequestException;
import com.spring.testUsers.entities.User;
import com.spring.testUsers.repositories.IUserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private final IUserRepository userRepo;
	
	public UserServiceImpl(IUserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public User saveUser(User user) {
		if (userRepo.findByEmail(user.getEmail()).isEmpty()) {
			userRepo.save(user);
			User newUser = userRepo.findByEmail(user.getEmail()).get(0);
			newUser.setIsActive("Active");
			newUser.setLastLogin(newUser.getCreatedAt());
			return userRepo.save(newUser);
		} else {
			System.out.print("Correo electronico ya existe");
			throw new EntityBadRequestException("Correo electronico ya existe");
		}

	}

}
