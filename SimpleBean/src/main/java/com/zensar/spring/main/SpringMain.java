package com.zensar.spring.main;

import org.checkerframework.checker.units.qual.g;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;

public class SpringMain {

	public static void main(String[] args) {
	
		//creating the object of Spring IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("greetings.xml");

		Greeting  festivalGreeting = ctx.getBean("festival", Greeting.class);
		System.out.println(festivalGreeting.greet());
		
		Greeting  anniversaryGreeting = ctx.getBean("anniversary", Greeting.class);
		System.out.println(anniversaryGreeting.greet());
		
	}
	
}
