package com.learning;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	// Need transaction
	public void save(Employee emp) {
		getJdbcTemplate().update("INSERT INTO emp(name, sal) " +
				"VALUES (?, ?)", new Object[] {emp.getName(), emp.getSalary()});
	}

	
	// Need a transaction
	public void save3Employees(Employee e1, Employee e2, Employee e3) {
			this.save(e1);
			this.save(e2);
			// if (1==1)throw new RuntimeException("unknown error");
			this.save(e3);
	}
	
	// Don't need transaction
	public Employee findById(long id) {
		//write logic
		return null;
	}
	//

}
