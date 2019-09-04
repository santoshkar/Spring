package com.learning;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Employee findById(long id) {
		return jdbcTemplate.queryForObject("SELECT empId, name, sal FROM EMP "
				+ "WHERE empId = ?", new Object[] {id}, new EmployeeRowMapper());
	}
	
	public List<Employee> findAll() {
		return jdbcTemplate.query("select empId, name, sal FROM emp", new EmployeeRowMapper());
	}
	
	public List<Employee> findByDepartmentIdAndSalary(long deptId, double salary) {
		return jdbcTemplate.query("select empId, name, sal FROM emp "
				+ "WHERE deptId = ? AND sal > ?", new Object[] {deptId, salary}, new EmployeeRowMapper());
	}
	

}
