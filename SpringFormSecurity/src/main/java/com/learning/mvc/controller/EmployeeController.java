package com.learning.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.mvc.model.Employee;
import com.learning.mvc.service.EmployeeService;

/**
 * 
 * @author santoshkumarkar
 *
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

	private EmployeeService employeeService;
	
	public String showAllEmployees(ModelMap modelMap) {
		
		List<Employee> empList = employeeService.findAllEmployees();
		modelMap.put("empList", empList);
		
		return "home";
		
	}
}
