package com.corejava.java8.features.lambda;

public class LambdaExample {
	public static void main(String[] args) {
		int width = 5;

		//With lambda
		Drawable d = () -> {
			System.out.println("Drawing : width :: " + width);
		};
		d.draw();
	}
}
