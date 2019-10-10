package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.instruments.Instrument;
import com.zensar.spring.performers.Performer;

public class ZensorIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		
		Performer instrumentalist =  ctx.getBean("Sudhanya", Performer.class);
		instrumentalist.perform();
		ConfigurableApplicationContext cfgCtx = (ConfigurableApplicationContext) ctx;
		cfgCtx.close();   	//Shutting down Spring IOC container
//		Instrument i = ctx.getBean("Guitar", Instrument.class);
//		i.play();
	}

}
