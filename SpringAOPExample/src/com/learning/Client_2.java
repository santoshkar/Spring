package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_2 {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext_2.xml");
		
		/*
		 * Notice here, we are using the service bean, but NOT the proxy bean 
		 * Because we have used BeanNameAutoProxyCreator which is taking care of proxy and bean
		 */
		StudentServiceImpl service = (StudentServiceImpl) ctx.getBean("studentService");
		System.out.println("\n-------------\n");
		service.saveStudents();
		
		System.out.println("\n-------------\n");
		service.updateStudents();
		
		System.out.println("\n-------------\n");
		service.showStudentList();
	}
}
