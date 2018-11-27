package com.corejava.java8.features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Use Stream.of() to create a stream from similar type of data
		Stream<Integer> stream = Stream.of(1,2,3,4);

		//Use Stream.of() with an array of Objects to return the stream.
		//Note: It doesn’t support autoboxing, so we can’t pass primitive type array.
		Stream<Integer> streamObj = Stream.of(new Integer[]{1,2,3,4}); 
		//works fine

		//Stream<Integer> stream1 = Stream.of(new int[]{1,2,3,4}); 
		//Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>

		//Use Collection stream() to create sequential stream and parallelStream() to create parallel stream.
		List<Integer> myList = new ArrayList<>();
		for(int i = 0; i < 5; i++) myList.add(i);

		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();

		//Use Stream.generate() and Stream.iterate() methods to create Stream.
		Stream<String> stream1 = Stream.generate(() -> {return "abc";});
		Stream<String> stream2 = Stream.iterate("abc", (i) -> i);

		//Using Arrays.stream() and String.chars() methods.

	}
}
