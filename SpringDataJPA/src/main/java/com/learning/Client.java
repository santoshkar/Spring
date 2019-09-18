	package com.learning;
	
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.model.Employee;
	
	public class Client {
		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = 
					new AnnotationConfigApplicationContext(AppConfig.class);
	
			EmployeeService empService = context.getBean(EmployeeService.class);
			Employee emp = empService.findById(1);
			System.out.println(emp);
			
			context.close();
		}
	}

	
	
	