package com.corejava.java8.features.lambda;

public class ExampleWithoutLambda {
	public static void main(String[] args) {

		int width = 10;

		//without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {

			@Override
			public void draw() {
				System.out.println("Implementing Drawable : width :: " + width);
			}
		};

		d.draw();
	}
}
