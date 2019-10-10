package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component("piano")
public class Piano implements Instrument {

	@Override
	public void play() {
		System.out.println("Instrumentalist is playing piano");
	}

}
