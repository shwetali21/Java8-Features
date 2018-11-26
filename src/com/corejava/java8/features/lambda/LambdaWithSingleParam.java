package com.corejava.java8.features.lambda;

interface SayableMsg {
	String say(String msg);
}

public class LambdaWithSingleParam {
	public static void main(String[] args) {

		//Lambda Expression with Single Parameter
		SayableMsg sayMsg = (name) -> {
			return "Hello" + name;
		};
		System.out.println(sayMsg.say("Java"));

		//Paranthesis can be ommitted
		SayableMsg sm = name -> {
			return "Hello" + name;
		};
		System.out.println(sm.say("Java"));
	}
}
