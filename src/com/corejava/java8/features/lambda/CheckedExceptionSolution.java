package com.corejava.java8.features.lambda;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CheckedExceptionSolution {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);

		integers.forEach(throwingConsumerWrapper(i -> writeToFile(i)));
		integers.forEach(throwingConsumerWrapper(CheckedExceptionSolution :: writeToFile));
		
		//Using Generics
		integers.forEach(handlingConsumerWrapper(i -> writeToFile(i), IOException.class));
		integers.forEach(handlingConsumerWrapper(CheckedExceptionSolution::writeToFile, IOException.class));
	}

	private static Object writeToFile(Integer i) {
		return i;
	}

	static <T> Consumer<T> throwingConsumerWrapper(
			ThrowingConsumer<T, Exception> throwingConsumer) {

		return i -> {
			try {
				throwingConsumer.accept(i);
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		};
	}

	//Using generics
	static <T, E extends Exception> Consumer<T> handlingConsumerWrapper(
			ThrowingConsumer<T, E> throwingConsumer, Class<E> exceptionClass) {

		return i -> {
			try {
				throwingConsumer.accept(i);
			} catch (Exception ex) {
				try {
					E exCast = exceptionClass.cast(ex);
					System.err.println("Exception occured : " + exCast.getMessage());
				} catch (ClassCastException ccEx) {
					throw new RuntimeException(ex);
				}
			}
		};
	}
}
