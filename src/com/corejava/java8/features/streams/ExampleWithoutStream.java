package com.corejava.java8.features.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleWithoutStream {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(10);
		list.add(11);

		System.out.println("List: " + sumIterator(list));
	}

	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}
}
