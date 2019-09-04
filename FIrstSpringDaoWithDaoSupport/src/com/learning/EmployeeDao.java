package com.learning;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDao extends JdbcDaoSupport {
	
	public Employee findById(long id) {
		return getJdbcTemplate().queryForObject("SELECT empId, name, sal FROM EMP "
				+ "WHERE empId = ?", new Object[] {id}, new EmployeeRowMapper());
	}
	
	public List<Employee> findAll() {
		return getJdbcTemplate().query("select empId, name, sal FROM emp", new EmployeeRowMapper());
	}
	
	public List<Employee> findByDepartmentIdAndSalary(long deptId, double salary) {
		return getJdbcTemplate().query("select empId, name, sal FROM emp "
				+ "WHERE deptId = ? AND sal > ?", new Object[] {deptId, salary}, new EmployeeRowMapper());
	}

}
