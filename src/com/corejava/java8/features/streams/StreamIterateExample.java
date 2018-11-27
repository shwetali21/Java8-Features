package com.corejava.java8.features.streams;

import java.util.stream.Stream;

public class StreamIterateExample {
	public static void main(String[] args) {
		
		Stream.iterate(1, element -> element+1) 	//iterate(fromValue, iterationCondition
			  .filter(element -> element%5 == 0)  
			  .limit(5)  
			  .forEach(System.out::println);  	//Takes argument as Consumer(Represents an operation that accepts a single input argument and returns no result)
	}  
}
