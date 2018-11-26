package com.corejava.java8.features.functionalinterface;

//We can instantiate an interface with anonymous class but the code looks bulky.
public class FIWithAnnonymousClass {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Run Method on Annonymous Class");
			}
		};
	}
}
