package com.corejava.java8.features.string;

import java.util.stream.IntStream;

public class StringStreamExample {
	public static void main(String[] args) {

		String s = "Hello World";
		IntStream stream = s.chars();	//creates a stream on a string of s'

		stream.mapToObj(letter -> (char)letter)
		.map(Character::toUpperCase)
		.forEach(System.out::print);
	}
}
