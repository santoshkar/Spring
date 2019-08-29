package com.learning.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice{
	public void afterThrowing(Exception e) {
		e.printStackTrace();
		System.out.println("There is an excepton"+e.getMessage());
		
		//If exception, what to do
	}
}
