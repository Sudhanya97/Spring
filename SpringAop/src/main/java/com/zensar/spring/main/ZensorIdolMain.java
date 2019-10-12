package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.performers.Performer;

public class ZensorIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer magician =  ctx.getBean("jaggu", Performer.class);
	
		try {
			magician.perform();
		} catch (com.zensar.spring.exceptions.PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
