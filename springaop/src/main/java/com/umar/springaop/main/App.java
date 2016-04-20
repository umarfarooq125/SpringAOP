package com.umar.springaop.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.umar.springaop.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("Umar");

		employeeService.getEmployee().throwException();

		ctx.close();
	}
}
