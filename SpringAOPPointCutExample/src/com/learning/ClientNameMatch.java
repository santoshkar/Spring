package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientNameMatch {
	
	public static void main(String[] args) {
		
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext-name-matched-pointcut.xml");
		
		//			OR
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext-name-matched-pointcut2.xml");
		
		
		StudentServiceImpl service = (StudentServiceImpl) ctx.getBean("studentServiceProxy");
		
		System.out.println("\n-------------\n");
		service.saveStudents();
		
		System.out.println("\n-------------\n");
		service.updateStudents();
		
		System.out.println("\n-------------\n");
		service.showStudentList();
	}
}
