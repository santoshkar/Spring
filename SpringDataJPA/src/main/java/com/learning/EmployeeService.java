	package com.learning;
	
	import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dao.EmployeeRepository;
import com.learning.model.Employee;
	
	@Service
	public class EmployeeService {
	
		@Autowired
		private EmployeeRepository employeeRepository;
	
		@Transactional
		public void add(Employee employee) {
			employeeRepository.save(employee);
		}
		
		public Employee findById(long id) {
			return employeeRepository.findById(id).get();
		}
	
		public List<Employee> listEmployees() {
			return (List<Employee>) employeeRepository.findAll();
		}
	}
