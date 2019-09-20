package com.learning.mvc;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	public Employee getById(Long id) {
		return new Employee(1L, "Nirmala");
	}
	
	public void saveEmployee(Employee emp) {
		System.out.println("Emp saved");
	}

}
