package com.proxybean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Executing : " + target.getClass().getName());
		
	}

}
