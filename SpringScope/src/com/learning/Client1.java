package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// ctx.
		
		MyCurrency currency1 = (MyCurrency) ctx.getBean("myCurrency");	//New Object
		MyCurrency currency2 = (MyCurrency) ctx.getBean("myCurrency");
		MyCurrency currency3 = (MyCurrency) ctx.getBean("myCurrency");
		
		currency1.setCurrencyType("USD");
		System.out.println(currency1.getCurrencyType());
		System.out.println(currency2.getCurrencyType());	//Null when the scope is prototype
		System.out.println(currency3.getCurrencyType());	//Null when the scope is prototype
		
		
		currency2.setCurrencyType("INR");
		currency3.setCurrencyType("SGD");
		
		System.out.println(currency1.getCurrencyType());
		System.out.println(currency2.getCurrencyType());
		System.out.println(currency3.getCurrencyType());
		
		
		
	}

}
