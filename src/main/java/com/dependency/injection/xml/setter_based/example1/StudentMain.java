package com.dependency.injection.xml.setter_based.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//to avoid downcasting explicitly, specify the student class type as well
		Student student = context.getBean("student", Student.class);
		student.showDetails();
		
		//to avoid downcasting explicitly, specify the student class type as well
		Student student2 = context.getBean("newStudent", Student.class);
		student2.showDetails();
	}
}
