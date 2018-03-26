package com.springmvc.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.hibernate.employeebeans.Employee;
import com.springmvc.hibernate.entity.EmployeeEntity;
import com.springmvc.hibernate.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
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
		System.out.println(employeebean.getName()+" "+employeebean.getSalary()+" "+employeebean.getDesignation());
		EmployeeEntity em=new EmployeeEntity();
	
		em.setName(employeebean.getName());
		em.setSalary(employeebean.getSalary());
		em.setDesignation(employeebean.getDesignation());
		employeeService.saveEmployee(em);
		return new ModelAndView("success");
	}
	
	@RequestMapping("/viewEmployee")
	public String viewEmployee(Model model) {
		List<Employee> list=employeeService.viewEmployees();
		model.addAttribute("allEmployees", list);
		return "getEmployee";
		
	}
	
	@RequestMapping(value = "/deleteEmployee", method=RequestMethod.GET)
	public String deleteEmployee(@RequestParam("Id") Integer id, Model model) {
	
		System.out.println("I can delete the employee with id: " + id);
		employeeService.deleteEmployee(id);
		return "redirect:/viewEmployee.html";
}
	
	@RequestMapping(value = "/updateEmployee", method=RequestMethod.GET)
	public ModelAndView updateEmployee(@RequestParam("Id") Integer id, Model model) {
		System.out.println("I can update the employee with id: " + id);
		EmployeeEntity employeeEntity = employeeService.updateEmployee(id);
		Employee employeeBean = new Employee();
		employeeBean.setId(employeeEntity.getId());
		employeeBean.setName(employeeEntity.getName());
		employeeBean.setSalary(employeeEntity.getSalary());
		employeeBean.setDesignation(employeeEntity.getDesignation());
		System.out.println("Update the employee with name: " + employeeBean.getName());

		return new ModelAndView("employeeform", "command", employeeBean);
		

		
	}
}

