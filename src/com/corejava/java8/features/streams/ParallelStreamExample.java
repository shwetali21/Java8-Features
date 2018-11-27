package com.corejava.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();

		System.out.println(count);
	}
}

