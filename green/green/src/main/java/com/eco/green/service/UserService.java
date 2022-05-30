package com.eco.green.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eco.green.entity.User;
import com.eco.green.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	
	public User salvarUser(@Valid User user) throws Exception {	
		return userRepository.save(user);

	} 
}
