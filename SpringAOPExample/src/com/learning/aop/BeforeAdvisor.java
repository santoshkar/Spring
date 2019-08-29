package com.learning.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{

	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Before the method execution : "+method.getName());
	}

}
