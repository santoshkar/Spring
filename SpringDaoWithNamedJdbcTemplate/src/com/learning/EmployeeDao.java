package com.learning;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;

	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Employee findById(long id) {
		
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("empId", id);
		
		return jdbcTemplate.queryForObject("SELECT empId, name, sal FROM EMP "
				+ "WHERE empId = :empId", map, new EmployeeRowMapper());
	}
	
	public List<Employee> findAll() {
		return jdbcTemplate.query("select empId, name, sal FROM emp", new EmployeeRowMapper());
	}
	
	public List<Employee> findByDepartmentIdAndSalary(long deptId, double salary) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("deptId", deptId);
		map.put("sal", salary);
		
		return jdbcTemplate.query("select empId, name, sal FROM emp "
				+ "WHERE deptId = :deptId AND sal > :sal", map, new EmployeeRowMapper());
	}
	

}
