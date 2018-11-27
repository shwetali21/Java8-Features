package com.corejava.java8.features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {  
	int id;  
	String name;  
	float price;  

	public Product(int id, String name, float price) {  
		this.id = id;  
		this.name = name;  
		this.price = price;  
	}  
}  

public class StreamFilterExample {
	public static void main(String[] args) {  
		List<Product> productsList = new ArrayList<>();  
		
		//Adding Products  
		productsList.add(new Product(1, "HP Laptop", 25000f));  
		productsList.add(new Product(2, "Dell Laptop", 30000f));  
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));  
		productsList.add(new Product(4, "Sony Laptop", 28000f));  
		productsList.add(new Product(5, "Apple Laptop", 90000f));  
		
		List<Float> productPriceList2 =	productsList.stream()  
													.filter(p -> p.price > 30000)	// filtering data  - takes argument as a Predicate (boolean-value-function)
													.map(p->p.price)        	 	// fetching price  - takes argument as a Function (Represents a function that accepts one argument and produces a result. 
													.collect(Collectors.toList());  // collecting as list  
		System.out.println(productPriceList2);  
	}  
}


/*
 * .filter(p -> p.price > 30000)  - takes argument as a Predicate (boolean-value-function)
 * .map(p->p.price)        	      - takes argument as a Function (Represents a function that accepts one argument and produces a result)
 * .collect(Collectors.toList()); - takes argument as a Collector (reduction)
 */