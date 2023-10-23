package com.eco.green.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eco.green.dto.UserDto;
import com.eco.green.entity.User;
import com.eco.green.exception.NegocioException;
import com.eco.green.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User salvedUser(@Valid UserDto userDto) throws Exception {
		
        User emailexist = userRepository.findByEmail(userDto.email());
		
		if (emailexist != null) {
			throw new NegocioException("An exists for this email.");
		}
		
		var user = new User(); 
		user.setId(userDto.id());
		user.setName(userDto.name());
		user.setAge(userDto.age());  
		user.setSex(userDto.sex());
		user.setEmail(userDto.email());
		user.setSuggestion(userDto.suggestion());
		
		return userRepository.save(user); 
	}

}
    
