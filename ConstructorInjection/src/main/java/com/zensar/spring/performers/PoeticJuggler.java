package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler {

		private Poem poem;
		public PoeticJuggler() {
			System.out.println("Default constructor for poetic juggler");
		}
		public PoeticJuggler(int beanBags, Poem poem) {
			super(beanBags);
			this.poem = poem;
			System.out.println("Parameterized constructor of Poetic juggler");
		}
		@Override
		public void perform() {
			// TODO Auto-generated method stub
			super.perform();
			System.out.println("While reciting a poem...");
			poem.recite();
		}
		
}
