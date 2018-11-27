package com.corejava.java8.features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<>();  

		//Adding Products  
		productsList.add(new Product(1, "HP Laptop", 25000f));  
		productsList.add(new Product(2, "Dell Laptop", 30000f));  
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));  
		productsList.add(new Product(4, "Sony Laptop", 28000f));  
		productsList.add(new Product(5, "Apple Laptop", 90000f));  

		// Converting Product List into a Map  
		Map<Integer,String> productPriceMap = productsList.stream()  
														  .collect(Collectors.toMap(p -> p.id, p -> p.name));  

		System.out.println(productPriceMap);  
	}  
}
