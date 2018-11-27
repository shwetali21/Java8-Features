package com.corejava.java8.features.defaultinterface;

public interface MyInterface2 {

	default void newMethod() {  
		System.out.println("Newly added default method2");  
	}  

	void display(String str); 
}
