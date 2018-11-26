package com.corejava.java8.features.functionalinterface;

/**Functional interfaces have only one abstract method, 
 * lambda expressions can easily provide the method implementation. 
 * We just need to provide method arguments and business logic
 */
public class FIWithLambdaExpression {

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("Runnable with Lambda Expression");
		};
		
		Runnable r1 = () -> System.out.println("My Runnable");
	}
}
