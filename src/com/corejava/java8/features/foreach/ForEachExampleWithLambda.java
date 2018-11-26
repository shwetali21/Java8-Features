package com.corejava.java8.features.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExampleWithLambda {
	
	public static void main(String[] args) {
		
		List<String> gamesList = new ArrayList<>();
		gamesList.add("Football");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		
		System.out.println("Iterating by passing Lambda Expression");
		gamesList.forEach(game -> System.out.println(game));
		
		System.out.println();
		System.out.println("Iterating by passing Method Reference");
		gamesList.forEach(System.out::println);
		
	}
}
