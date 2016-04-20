package com.umar.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("executing advice on getname");
	}
	
	@Before("execution(* com.umar.springaop.*.get*())")
	public void getAllAdvice() {
		System.out.println("service method getter called");
	}
}
