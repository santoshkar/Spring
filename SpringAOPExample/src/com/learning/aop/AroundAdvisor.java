package com.learning.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Concern Before service");
		Object obj = invocation.proceed();
		System.out.println("Concern After the service");
		return obj;
	}

}
