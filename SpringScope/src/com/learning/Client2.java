package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		
		MyCurrency currency1 = (MyCurrency) ctx.getBean("myCurrency");	//New Object
		
		ctx.registerShutdownHook();
		
		
		
		
	}

}
