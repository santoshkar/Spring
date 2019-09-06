package com.learning;

public interface EmployeeDao {
	
	// Need transaction
	public void save(Employee e);
	
	// Need transaction
	public void save3Employees(Employee e1, Employee e2, Employee e3);
	
	// Don't need transaction
	public Employee findById(long id);
}
