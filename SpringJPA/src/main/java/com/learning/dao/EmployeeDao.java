package com.learning.dao;

import java.util.List;

import com.learning.model.Employee;

public interface EmployeeDao {
	public void add(Employee employee);
	
	public Employee findById(Long id);
	
	public List<Employee> findByName(String name);
	
	public List<Employee> findAll();
}
