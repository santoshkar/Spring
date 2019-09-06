package com.learning;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	
	private TransactionTemplate transactionTemplate;

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	// Need transaction
	public void save(Employee emp) {
		getJdbcTemplate().update("INSERT INTO emp(name, sal) " +
				"VALUES (?, ?)", new Object[] {emp.getName(), emp.getSalary()});
	}
	
	// Need a transaction
	public void save3Employees(final Employee e1, final Employee e2, final Employee e3) {

		//DB Script
		transactionTemplate.execute(new TransactionCallback<Boolean>() {
			public Boolean doInTransaction(TransactionStatus status) {

				try{
					save(e1);
					save(e2);

					if (1==1) throw new RuntimeException("Unknown Error");
					save(e3);

					System.out.println("Tx Completed");
				} catch (Exception e) {

					status.setRollbackOnly();
					System.out.println("Tx Rolled back");
				}


				return status.isCompleted();
			}});

	}
	
	// Don't need transaction
	public Employee findById(long id) {
		//write logic
		return null;
	}
	//

}
