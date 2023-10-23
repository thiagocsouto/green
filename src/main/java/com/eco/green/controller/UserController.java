package com.eco.green.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eco.green.dto.UserDto;
import com.eco.green.exception.NegocioException;
import com.eco.green.service.UserService;

@Controller
@RequestMapping("/")
public class UserController{
	
	@Autowired 
	private UserService userService;
	
	@GetMapping("/home")
	public ModelAndView home(@Valid UserDto userDto) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/index");
		mv.addObject("user", new UserDto(null, null, null, null, null, null)); 
		return mv;  
	}
	 
	@PostMapping("/home")
	public ModelAndView Adicionar(@Valid UserDto userDto, BindingResult br) throws Exception {
	    ModelAndView mv = new ModelAndView();
	    if(br.hasErrors()) {
	        mv.setViewName("home/index");
	        mv.addObject(userDto);
	        return mv;
	    } else {
	        try {
	            userService.salvedUser(userDto);
	            mv.setViewName("redirect:/home");
	            return mv;
	        } catch (NegocioException e) {
	            br.rejectValue("email", "error.user", e.getMessage());
	            mv.setViewName("home/index");
	            mv.addObject(userDto);
	            return mv;
	        }
	    }
	    
	}







		 
		
}
