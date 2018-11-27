package com.corejava.java8.features.defaultinterface;

public class DefaultMethodExample implements MyInterface {

	// implementing abstract method
	public void existingMethod(String str){           
		System.out.println("String is: "+str);  
	}

	public static void main(String[] args) {  
		DefaultMethodExample obj = new DefaultMethodExample();

		//calling the default method of interface
		obj.newMethod();     
		//calling the abstract method of interface
		obj.existingMethod("Java 8 is easy to learn"); 
	}  
}
