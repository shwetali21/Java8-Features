package com.corejava.java8.features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UnCheckedExceptionSolution {
	
	public static void main(String[] args) {

		//Using Consumer
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(lambdaWrapper(i -> System.out.println(50 / i)));

		//using generics
		List<Integer> integerList = Arrays.asList(3, 9, 7, 0, 10, 20);
		integerList.forEach(consumerWrapper(
				i -> System.out.println(50 / i), 
				ArithmeticException.class));
	}

	//Type Specific Consumer
	static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (ArithmeticException e) {
				System.err.println("Arithmetic Exception occured : " + e.getMessage());
			}
		};
	}

	//Generic method for Exception
	static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> clazz) {

		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception ex) {
				try {
					E exCast = clazz.cast(ex);
					System.err.println("Exception occured : " + exCast.getMessage());
				} catch (ClassCastException ccEx) {
					throw ex;
				}
			}
		};
	}
}
