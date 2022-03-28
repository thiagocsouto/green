package com.eco.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eco.green.entity.User;

@Controller
public class userController {
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/index");
		mv.addObject("user", new User());
		return mv;
		
	}

}
