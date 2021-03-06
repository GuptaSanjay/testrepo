package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.beans.Employee;

@Controller
public class FirstSpringMVCController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}

	@RequestMapping("/msg")
	public String sendMessage(Model m) {
		m.addAttribute("message", "Hello from SpringMVC");
		m.addAttribute("message1", "You can Start your learnings");
		return "kitchen";
	}
	
	@RequestMapping("/smessage")
	public ModelAndView sendSuperMessage(ModelAndView mv) {
		mv.addObject("food", "Hello from modelAndView");
		mv.setViewName("canteen");
		return mv;
	}
	
	@RequestMapping("/empform")
	public ModelAndView showform(ModelAndView mv) {
		return new ModelAndView("empform", "command", new Employee());
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee emp) {
		 System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation()); 
		return new ModelAndView("redirect:/viewemp");
		
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){   
        List<Employee> list=new ArrayList<Employee>();  
        list.add(new Employee("rahul",35000f,"S.Engineer"));  
        list.add(new Employee("aditya",25000f,"IT Manager"));  
        list.add(new Employee("sachin",55000f,"Care Taker"));  
          
        return new ModelAndView("viewemp","list",list);  
    }  
}
