package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
public class AnniversaryGreeting implements Greeting {

	public AnniversaryGreeting() {
		System.out.println("Anniversary greeting is crated");
	}
	
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary";
	}

}
