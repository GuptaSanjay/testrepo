package com.springmvc.hibernat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.form.employee.beans.Employee;


@Controller
public class EmployeeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView welcom() {
		return new ModelAndView("index");
	}

	@RequestMapping("/employeeform")
	public ModelAndView showform() {
		return new ModelAndView("/employeeform","command",new Employee());
				
	}
	
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee employeebean) {
		System.out.println(employeebean.getId()+" "+employeebean.getName()+" "+employeebean.getSalary()+" "+employeebean.getDesignation());
		return new ModelAndView("success");
	}
}