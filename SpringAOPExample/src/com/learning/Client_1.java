package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_1 {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext_1.xml");
		
		/*
		 * Notice here, we are using the proxy bean, but NOT the service bean 
		 * Because we have used <b>ProxyFactoryBean</b>
		 */
		StudentServiceImpl service = (StudentServiceImpl) ctx.getBean("studentServiceProxy");
		service.showStudentList();
	}
}
