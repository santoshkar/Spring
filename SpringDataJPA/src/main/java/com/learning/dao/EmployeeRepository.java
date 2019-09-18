	package com.learning.dao;
	
	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

import com.learning.model.Employee;
	
	@Repository
	public interface EmployeeRepository 
		extends CrudRepository<Employee, Long> {
		
	}

	
	