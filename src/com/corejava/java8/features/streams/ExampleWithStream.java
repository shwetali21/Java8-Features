package com.corejava.java8.features.streams;

import java.util.ArrayList;
import java.util.List;

public class ExampleWithStream {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(10);
		list.add(11);

		System.out.println("List: " + sumStream(list));
	}

	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}
}
