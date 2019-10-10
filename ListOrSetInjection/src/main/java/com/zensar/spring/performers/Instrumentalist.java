package com.zensar.spring.performers;

import java.util.List;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private String song;
	private Set<Instrument> intruments;
	
	public Set<Instrument> getIntruments() {
		return intruments;
	}

	public void setIntruments(Set<Instrument> intruments) {
		this.intruments = intruments;
	}

	public Instrumentalist(String song, Instrument instrument) {

		this.song = song;
	}
	
	public Instrumentalist() {
		System.out.println("Instrumentalist is created");
	}
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	
	@Override
	public void perform() {
		System.out.println("Instrumentalist is playing a song");
		for(Instrument instrument : intruments) {
			instrument.play();
		}
	}

}
