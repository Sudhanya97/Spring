package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensorIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		
		Performer instr = ctx.getBean("Sudhanya", Performer.class);
		instr.perform();
		
		Performer instrumentalist =  ctx.getBean("Piku", Performer.class);
		instrumentalist.perform();
		
		Performer i = ctx.getBean("Piku1", Performer.class);
		i.perform();
	}

}
