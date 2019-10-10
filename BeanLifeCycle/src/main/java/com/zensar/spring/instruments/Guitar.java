package com.zensar.spring.instruments;

public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Ting ting ting");
	}

	@Override
	public void tune() {
		System.out.println("Guitar is tuned");
	}

	@Override
	public void clean() {
		System.out.println("Guitar is cleaned");
	}

}
