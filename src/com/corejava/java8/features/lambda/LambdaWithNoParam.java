package com.corejava.java8.features.lambda;

interface Sayable{  
	public String say();  
}  

public class LambdaWithNoParam {  
	public static void main(String[] args) { 

		//Lambda Expression with No Parameter
		Sayable s = () -> {  
			return "I have nothing to say.";  
		};  
		System.out.println(s.say());  
	}  
} 