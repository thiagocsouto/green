package com.eco.green.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.validation.BindingResult;
import com.eco.green.entity.User;
import com.eco.green.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public ModelAndView home(User user) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/index");
		mv.addObject("user", new User());
		return mv;
	}
	
		@PostMapping("/home")
		public ModelAndView Adicionar(@Valid User user, BindingResult com) {
			ModelAndView mv = new ModelAndView();
			if(com.hasErrors()) {
				mv.setViewName("home/index");
				mv.addObject(user);
			} else {
			mv.setViewName("redirect:/home");
			userService.salvarUser(user);
			}
			return mv;   
		}

}