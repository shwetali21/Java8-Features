package com.corejava.java8.features.functionalinterface;

//A functional interface can have methods of object class.
@FunctionalInterface
interface SayableWithMethods {
	void say(String msg);	//abstract message

	//Can contain any number of Object class methods.
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class FunctionInterfaceWithMethods implements SayableWithMethods {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionInterfaceWithMethods fie = new FunctionInterfaceWithMethods();
		fie.say("Functional Interface can have methods of Object class.");
	}
}
