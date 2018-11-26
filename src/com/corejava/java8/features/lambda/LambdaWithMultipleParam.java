package com.corejava.java8.features.lambda;

interface Addition {
	int add(int a, int b);
}

public class LambdaWithMultipleParam {
	public static void main(String[] args) {

		//Lambda expression with Multiple Parameters
		Addition adding = (a,b)-> { return a+b;};
		System.out.println(adding.add(100, 2));
		
		
		//In Java lambda expression, if there is only one statement, you may or may not use return keyword.
		//You must use return keyword when lambda expression contains multiple statements.
		Addition a1 = (a, b)-> a+b;
		System.out.println(a1.add(1, 2));
	}
}
