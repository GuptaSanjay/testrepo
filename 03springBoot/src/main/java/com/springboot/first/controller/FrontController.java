package com.springboot.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute User user, User password){  
	        ModelAndView modelAndView = new ModelAndView();  
	modelAndView.setViewName("userdata");      
	modelAndView.addObject("user", user); 
	modelAndView.addObject("password",password);
	return modelAndView; 

}
}
