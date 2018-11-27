package com.corejava.java8.features.methodreference;

interface Sayable {  
	void say();  
}  

public class MethodRefForStatic {

	public static void saySomething(){  
		System.out.println("Hello, this is static method.");  
	}  

	public static void main(String[] args) {  
		// Referring static method  
		Sayable sayable = MethodRefForStatic::saySomething;  
		// Calling interface method  
		sayable.say();  
	}  
}
