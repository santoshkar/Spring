package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmployeeDao empDao = (EmployeeDao) ctx.getBean("empDao");
		Employee emp = empDao.findById(1);
		System.out.println(emp);
		Employee emp2 = new Employee();
		emp2.setName("scott");
		emp2.setSalary(12323);
		
		empDao.save2(emp2);
	}

}
