package com.zensar.spring.performers;

public class Juggler implements Performer {

		private int beanBags;
		public Juggler() {
			// TODO Auto-generated constructor stub
			System.out.println("No arg constructor of juggler called");
		}
		public Juggler(int beanBags) {
			this.beanBags = beanBags;
			System.out.println("Parameterized constructor of juggler called");
		}
		public void perform()
		{
			System.out.println("Juggler juggling beanBags" +beanBags);
		}
}
