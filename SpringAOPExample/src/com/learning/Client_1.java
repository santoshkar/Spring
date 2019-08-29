package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		StudentServiceImpl service = (StudentServiceImpl) ctx.getBean("studentService");
		service.showStudentList();
	}
}
