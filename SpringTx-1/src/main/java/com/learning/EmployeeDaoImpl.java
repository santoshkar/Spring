package com.learning;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	
	private PlatformTransactionManager transactionManager;

	public PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}


	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}


	// Need transaction
	public void save(Employee emp) {
		getJdbcTemplate().update("INSERT INTO emp(name, sal) " +
				"VALUES (?, ?)", new Object[] {emp.getName(), emp.getSalary()});
	}

	
	// Need a transaction
	public void save3Employees(Employee e1, Employee e2, Employee e3) {

		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(transactionDefinition);

		try{
			this.save(e1);


			this.save(e2);

			if (1==1)throw new RuntimeException("unknown error");

			this.save(e3);
			
			System.out.println("Tx completed successfully");

			transactionManager.commit(status);

		} catch (Exception e) {
			transactionManager.rollback(status);
			
			System.out.println("Tx rolledback because of exception :"+e.getMessage());
		}

	}
	
	// Don't need transaction
	public Employee findById(long id) {
		//write logic
		return null;
	}
	//

}
