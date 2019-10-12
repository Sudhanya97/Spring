package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;

@Component("jaggu")
public class Juggler implements Performer {

	@Value("5")
	private int beanBags;
	
	@Override
	public void perform() throws PerformanceException {
		
		if(beanBags<3) {
			throw new PerformanceException("Number of beanBags not sufficient");
		}
		else {
			System.out.println("Juggler juggling "+beanBags+" beanBags");
		}
	}

}
