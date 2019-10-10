package com.zensar.spring.poems;

import com.zensar.spring.performers.Performer;

public class TwinkleTwinkle implements Poem {
	private static final String LINES[]= {
			"Twinkle twinkle little star", 
			"how I wonder what you are!",
			"up above the world so high",
			"like a diamond in the sky."
	};

	@Override
	public void recite() {
		for(String line:LINES) {
			System.out.println(line);
		}
	}

}
