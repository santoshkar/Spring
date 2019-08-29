package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientRegex {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext-regex-pointcut.xml");
		
		/*
		 * Notice here, we are using the service bean, but NOT the proxy bean 
		 * Because we have used BeanNameAutoProxyCreator which is taking care of proxy and bean
		 */
		StudentServiceImpl service = (StudentServiceImpl) ctx.getBean("studentProxy");
		System.out.println("\n-------------\n");
		service.saveStudents();
		
		System.out.println("\n-------------\n");
		service.updateStudents();
		
		System.out.println("\n-------------\n");
		service.showStudentList();
	}
}
