package com.learning.annotation.org.learning.carracing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Participant {
	public static void main(String args[]) {
	
		ApplicationContext ctx1 = 
				new AnnotationConfigApplicationContext(MySpringConfig.class);
		
		Race race = (Race) ctx1.getBean("race");
		race.startRace();
		
		
	}
}
