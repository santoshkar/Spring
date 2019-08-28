package org.learning.carracing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Participant {
	public static void main(String args[]) {
		Race r;
		
		//BeanFactory
		//ApplicationContext
		//ApplicationContext ctx1 = 
		//		new FileSystemXmlApplicationContext("ApplicationContext.xml");
		
		
		ApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		// AnnotationConfigApplicationContext,
		// FileSystemXmlApplicationContext
		// ClassPathXmlApplicationContext
		
		Race race = (Race) ctx1.getBean("race");
		race.startRace();
		
		
	}
}
