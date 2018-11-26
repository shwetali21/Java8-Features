package com.corejava.java8.features.lambda;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CheckedExceptionProblem {

	//Throwing the exception from main is does nothing and 
	//since the method in the parent interface doesn’t throw any exception, it can’t in its implementation
	public static void main(String[] args) throws IOException {

		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(i -> {
			try {
				writeToFile(i);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});

	}

	private static Object writeToFile(Integer i) throws IOException {
		return i;
	}

	//The below code doesn’t compile because the implementation of accept method can’t throw any Exception.
	/*Consumer<Integer> consumer = new Consumer<Integer>() {
		@Override
		public void accept(Integer integer) throws Exception {
			writeToFile(integer);
		}
	};
*/
}
