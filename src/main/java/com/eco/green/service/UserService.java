package com.eco.green.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eco.green.entity.User;
import com.eco.green.exception.NegocioException;
import com.eco.green.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User salvedUser(@Valid User user) throws Exception {		
		
		User emailexist = userRepository.findByEmail(user.getEmail());
		
		if (emailexist != null) {
			throw new NegocioException("An exists for this email.");
		}
		
		return userRepository.save(user);
	}

}
    
