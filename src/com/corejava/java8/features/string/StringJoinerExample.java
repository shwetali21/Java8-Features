package com.corejava.java8.features.string;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(", ");
		sj.add("one").add("two").add("three");
		System.out.println(sj.toString());

		//StringJoiner with start and end delimeters
		StringJoiner sj1 = new StringJoiner(", ", "{", "}");	//separator, start, end
		sj1.add("one").add("two").add("three");
		System.out.println(sj1.toString());

		//join method
		String str = String.join(",", "one", "two", "three");
		System.out.println(str);

		//Using Iterable internally
		String[] tab = {"a", "b", "c"};
		String s = String.join(", ", tab); 
		System.out.println(s);
	}
}
