package com.spring.testUsers.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.testUsers.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
	
	List<User> findByEmail(String email);
}
