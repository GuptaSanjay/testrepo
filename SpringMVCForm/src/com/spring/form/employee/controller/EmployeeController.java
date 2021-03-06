package com.spring.form.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.form.employee.beans.Employee;

@Controller
public class EmployeeController {
	List<Employee> list=new ArrayList<>();
	
	@RequestMapping("/employeeform")
	public ModelAndView showform() {
		return new ModelAndView("employeeform", "command", new Employee());
	}
	
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee employeebean) {
		System.out.println(employeebean.getId()+" "+employeebean.getName()+" "+employeebean.getSalary()+" "+employeebean.getDesignation());
		list.add(new Employee(1,"rahul",35000f,"S.Engineer"));  
        list.add(new Employee(2,"aditya",25000f,"IT Manager"));  
        list.add(new Employee(3,"sachin",55000f,"Care Taker")); 
        list.add(employeebean);
		return new ModelAndView("redirect:/viewemployee.html");
	}

	@RequestMapping("/viewemployee")
	 public ModelAndView viewemp(){  
	        //write the code to get all employees from DAO  
	        //here, we are writing manual code of list for easy understanding  
	       // List<Employee> list=new ArrayList<Employee>();  
	        
	        System.out.println(list.size()); 
	        /*list.add(new Employee()); */
	        return new ModelAndView("viewemployee","employeeList",list);  
	    }  
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView welcome()
	{
		return new ModelAndView("index");
	}
}
