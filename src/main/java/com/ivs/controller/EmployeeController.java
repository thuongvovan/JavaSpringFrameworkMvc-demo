package com.ivs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ivs.entity.Employee;
import com.ivs.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/addEmployee")
	public String addEmployee(@ModelAttribute("employee") Employee employ, Model model)
	{
		try {
			// insert employee input
			if (employ != null) {
				employeeService.insert(employ);
				System.out.println("insert : " + employ);
			}
		} catch (DuplicateKeyException ex) {
			model.addAttribute("errors", ex.fillInStackTrace());
			return "error";
		} catch (Exception ex) {
			model.addAttribute("errors", ex.fillInStackTrace());
			return "error";	
		}
		return "success";
	}	
}
