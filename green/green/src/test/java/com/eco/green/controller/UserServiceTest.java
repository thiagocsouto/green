package com.eco.green.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.eco.green.entity.User;
import com.eco.green.enuns.Sex;
import com.eco.green.repository.UserRepository;
import com.eco.green.service.UserService;

@SpringBootTest
class UserServiceTest { 
	
	@Autowired
	private UserRepository userRepository;
	 
	@Autowired
	private UserService userService; 

//	@Test
//      void testeParaVerficarCadastroDeFuncionariosEstaCorreto() {
//		User user = new User("Taison", 33 , Sex.MAN, "INTER@OUTLOOK.COM", "I LIKED GREEN"); 
//		User savedUser = userRepository.save(user); 	
//		
//		assertNotNull(savedUser);
//	}
//
//	
//	@Test
//	 void testCadastrandoUsuarioComIdadeIgualOuMenorAZero() throws Exception {
//        
//		assertThrows(IllegalArgumentException.class,
//				() -> userService.salvarUser(new User("Thiago", 0 , Sex.MAN, "THIAGO@OUTLOOK.COM", "I LIKED")));
//	}
//	
//	@Test
//	 void testCadastrandoEmailUsuarioNulo() throws Exception {
//       User user = new User("Thiago", 21 , Sex.MAN, null, "I LIKED");
//       Exception exception = assertThrows(Exception.class, () -> userService.salvarUser(user));
//   
//       	assertEquals("Email não pode ser nulo", exception.getMessage());
//	}
//	
//     @Test 
//   	 void testAgeInteger() throws Exception {
//          User user = new User("Thiago", "Antonio", 21 , Sex.MAN, "thiagocsouto@gmail.com", "I LIKED");
//          Exception exception = assertThrows(Exception.class, () -> userService.salvarUser(user));
//      
//          	assertEquals("Email não pode ser nulo", exception.getMessage());
//
//	} 
//	
//	
}
