package com.eco.green.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.eco.green.entity.User;
import com.eco.green.enuns.Sex;
import com.eco.green.exception.NegocioException;
import com.eco.green.repository.UserRepository;
import com.eco.green.service.UserService;

@SpringBootTest
class UserServiceTest { 
	
	@Autowired
	private UserRepository userRepository;
	 
	@Autowired
	private UserService userService; 

	@Test
      void testeParaVerficarCadastroDeFuncionariosEstaCorreto() {
		User user = new User(); 
		user.setName("Taison");
		user.setAge(Integer.toString(33));
		user.setSex(Sex.MAN);
		user.setEmail("inter@outlook.com");
		user.setSuggestion( "I am green");
		User savedUser = userRepository.save(user); 	
		
		assertNotNull(savedUser);
	}


	@Test
	 void testCadastrandoUsuarioComIdadeIgualOuMenorAZero() throws Exception {
        
		assertThrows(Exception.class,
				() -> userService.salvarUser(new User("Thiago", Integer.toString(0) , Sex.MAN, "THIAGO@OUTLOOK.COM", "I LIKED")));
	}
	
     @Test 
   	 void testToEmailExist() throws Exception {
          User user = new User();
          user.setName("Thiago");
  		  user.setAge(Integer.toString(33));
  		  user.setSex(Sex.MAN);
  		  user.setEmail("thiagoantoniocs47@gmail.com");
  		  user.setSuggestion( "I love green");
          Exception exception = assertThrows(NegocioException.class, () -> userService.salvarUser(user));
      
          assertEquals("An exists for this email.", exception.getMessage());

	} 
	
	
}
