package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;

public class SpringMain {

	public static void main(String[] args) {
	
		//creating the object of Spring IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("greetings.xml");

		Greeting  festGreeting = ctx.getBean("festival", Greeting.class);
		System.out.println(festGreeting.greet());
		
		Greeting  annGreeting = ctx.getBean("anniversaryGreeting", Greeting.class);
		System.out.println(annGreeting.greet());
		
	}
	
}
