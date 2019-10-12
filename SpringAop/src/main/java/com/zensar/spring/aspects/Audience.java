package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

	@Pointcut("execution(* *.perform(..))") 				//.. indicates all parameter
//	public void performancePointcut() {						//* * perform method belongs to any(0-many) class
//		
//	}
//	
	//@Pointcut("execution(void*.perform(..))") 
	//@Pointcut("*execution(void com.zensar.spring.performers.Juggler.perform(..))") 
	//@Pointcut("*execution(public void com.zensar.spring.performers.Juggler.perform(..))") 	
	
	public void performancePointcut() {						
		
	}
	
	//@Before(value = "performancePointcut()")
	@Before("execution(* *.perform(..))")
	public void takeSeats() {
		System.out.println("Audience are taking their seats");
	}
	
	@Before("performancePointcut()")
	public void switchOffCellPhones() {
		System.out.println("Audience are switching off their cellphones");
	}
	
	@AfterReturning("performancePointcut()")
	public void applaud() {
		System.out.println("CLAP CLAP CLAP ! ! !");
	}
	
	@AfterThrowing("performancePointcut()")
	public void demanRefund() {
		System.out.println("Give me my money back !");
	}
	
}
