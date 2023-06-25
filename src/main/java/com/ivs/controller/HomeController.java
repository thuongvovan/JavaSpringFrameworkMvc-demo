package com.ivs.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ivs.entity.Employee;
import com.ivs.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public String postdata( Model model) {
		try {
			// select all employee
			List<Employee> listEmployees = employeeService.selectAll();
			
			//return lists to employees.jsp
			model.addAttribute("employees", listEmployees);
			
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return "employees";
	}
	
	@RequestMapping("/employee")
	public String redirectEmployee()
	{
		return "employeeRegist";
	}
}