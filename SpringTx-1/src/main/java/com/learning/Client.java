package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		System.out.println(ctx);
		
		EmployeeDao dao = (EmployeeDao) ctx.getBean("empDao");
		
		Employee e1 = new Employee("Sudhakar", 100883203);
		Employee e2 = new Employee("Nirmala", 9798473);
		Employee e3 = new Employee("Rohit", 397987433);
		
		dao.save3Employees(e1, e2, e3);
		
	}
}
