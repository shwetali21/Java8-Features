package com.corejava.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 98);
		
		Integer red = list.stream().reduce(0, Integer::max); 
		System.out.println("Red:" + red);
		
	}
}