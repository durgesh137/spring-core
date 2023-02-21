package com.dependency.injection.xml.constructor_based.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentConstructorBaesdDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//to avoid downcasting explicitly, specify the student class type as well
		Student student = context.getBean("sam", Student.class);
		student.showDetails();
		
	}
}
