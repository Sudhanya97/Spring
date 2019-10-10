package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;
import com.zensar.spring.performers.PoeticJuggler;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Performer p = ctx.getBean("Pyare Mohan", Performer.class);
		p.perform();
		
		Performer p1 = ctx.getBean("sudha", Performer.class);
		p1.perform();
	}

}
