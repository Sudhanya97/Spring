package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;
	
	public Instrumentalist(String song, Instrument instrument) {

		this.song = song;
		this.instrument = instrument;
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

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.println("Instrumentalist is playing a song");
	}

}
