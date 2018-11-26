package com.corejava.java8.features.lambda;

import java.util.Arrays;
import java.util.List;

public class UnCheckedExceptionProblem {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(3, 9, 0, 6, 10, 20);
		integers.forEach(i -> {
			try {	
				System.out.println(50 / i);
			} catch(ArithmeticException e) {
				System.out.println("Error Occurred : " + e.getMessage());
			}
		});
	}
}
