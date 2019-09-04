package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println(ctx);
		
		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
		
		// System.out.println(dao.findAll());
		
		// System.out.println(dao.findById(1));
		
		System.out.println(dao.findByDepartmentIdAndSalary(5, 500000));
		
	}
}
