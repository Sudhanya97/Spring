package com.zensar.spring.performers;

import com.zensar.spring.magicboxes.Magicbox;

public class Magician implements Performer {

	private String magicWords;
	private Magicbox magicbox;

	public String getMagicWords() {
		return magicWords;
	}

	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

	public Magicbox getMagicbox() {
		return magicbox;
	}

	public void setMagicbox(Magicbox magicbox) {
		this.magicbox = magicbox;
	}

	@Override
	public void perform() {
		System.out.println("Magician says: "+magicWords);
		System.out.println(magicbox.getContents());
	}

}
