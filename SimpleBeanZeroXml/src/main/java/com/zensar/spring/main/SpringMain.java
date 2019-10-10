package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.spring.Greeting;
import com.zensar.spring.config.GreetingConfig;

public class SpringMain {

	public static void main(String[] args) {
	
		//creating the object of Spring IOC container
		ApplicationContext ctx = new AnnotationConfigApplicationContext(GreetingConfig.class);

		Greeting  festGreeting = ctx.getBean("festival", Greeting.class);
		System.out.println(festGreeting.greet());
		
		Greeting  annGreeting = ctx.getBean("anniversaryGreeting", Greeting.class);
		System.out.println(annGreeting.greet());
		
	}
	
}
