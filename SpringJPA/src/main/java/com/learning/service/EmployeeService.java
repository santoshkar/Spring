package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dao.EmployeeDao;
import com.learning.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	
	public Employee getEmployeeById(Long id) {
		return empDao.findById(id);
	}
	
	public List<Employee> getEmployeesByName(String name) {
		return empDao.findByName(name);
	}
	
	public void getAllEmployees() {
		 empDao.findAll();
	}
	
	public void createNewEmployee(Employee e) {
		empDao.add(e);
	}
}
