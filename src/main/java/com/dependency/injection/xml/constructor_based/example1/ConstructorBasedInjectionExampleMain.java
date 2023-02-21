package com.dependency.injection.xml.constructor_based.example1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorBasedInjectionExampleMain {
	public static void main(String[] args) {
		// load the spring Configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		SportsTeam theTeam = context.getBean("team", SportsTeam.class);

		// call the method on bean
		System.out.println(theTeam.getInstruction());
		
		//close the context
		context.close();

	}
}
