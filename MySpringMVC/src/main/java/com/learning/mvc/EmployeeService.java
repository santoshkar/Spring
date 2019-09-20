package com.learning.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;

	public void createANewEmployee() {
		Employee e = new Employee();	//setter/getter
		empDao.saveEmployee(e);
	}
	
	public Employee findAnEmployee(Long id) {
		return empDao.getById(id);
	}
	
	
}
