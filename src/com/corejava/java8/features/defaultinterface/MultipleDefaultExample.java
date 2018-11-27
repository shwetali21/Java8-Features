package com.corejava.java8.features.defaultinterface;

public class MultipleDefaultExample implements MyInterface, MyInterface2 { 

	// implementing abstract methods
	public void existingMethod(String str){           
		System.out.println("String is: "+str);  
	}  

	public void display(String str){
		System.out.println("String is: "+str); 
	}

	//Implementation of duplicate default method
	@Override
	public void newMethod() { 
		MyInterface.super.newMethod();
		//System.out.println("Implementation of default method");  
	}  

	public static void main(String[] args) {  
		MultipleDefaultExample obj = new MultipleDefaultExample();

		//calling the default method of interface
		obj.newMethod();     
	}
}

//Error: Duplicate default methods named newMethod with the parameters () and () are inherited from the types MyInterface2 and MyInterface