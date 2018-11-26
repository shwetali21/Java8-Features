package com.corejava.java8.features.functionalinterface;

@FunctionalInterface
interface Sayable {
	void say(String msg);
}

public class FunctionalInterfaceExample implements Sayable {

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Functional Interface Example");
	}
}
