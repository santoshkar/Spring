package com.learning;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Employee emp = new Employee();
		emp.setEmployeeId(rs.getLong(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getDouble(3));

		
		return emp;
		
	}

}
