package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

@Component("Sudhanya")
public class Instrumentalist implements Performer {
	@Value("Cheap thrils")
	private String song;
	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
	
	@Override
	public void perform() {
		System.out.println("Instrumentalist is playing a song "+song);
		instrument.play();
	}

}
