package com.eco.green.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eco.green.dto.UserDto;
import com.eco.green.entity.User;
import com.eco.green.enuns.Sex;
import com.eco.green.exception.NegocioException;
import com.eco.green.repository.UserRepository;

@SpringBootTest
class UserServiceTest { 
	
	@Autowired
	private UserRepository userRepository;
	 
	@Autowired
	private UserService userService; 

	@Test
    void test_for_verify_save_user_corret() {
		
		//model user
		User user = new User(); 
		user.setName("Taison");
		user.setAge(Integer.toString(33));
		user.setSex(Sex.MAN);
		user.setEmail("inter@outlook.com");
		user.setSuggestion( "I am green");
		
		//action
		User savedUser = userRepository.save(user); 	
		
		//asserts
		assertNotNull(savedUser);
	}


	@Test
	 void test_for_save_user_with_age_equals_our_less_zero() throws Exception {
        
		//asserts e action
		assertThrows(Exception.class,
				() -> userService.salvedUser(new UserDto(1, "Thiago", Integer.toString(-2) , Sex.MAN, "THIAGO@OUTLOOK.COM", "I LIKED")));
	}
	
     @Test 
   	 void test_for_email_exist() throws Exception {
    	 
    	 //model user
          UserDto userDto = new UserDto(1, "Thiago", Integer.toString(33), Sex.MAN, "thiagoantoniocs47@gmail.com", "I love green");
  		  
  		  //exception
          Exception exception = assertThrows(NegocioException.class, () -> userService.salvedUser(userDto));
      
          //asserts
          assertEquals("An exists for this email.", exception.getMessage());

	} 
	
	
}
