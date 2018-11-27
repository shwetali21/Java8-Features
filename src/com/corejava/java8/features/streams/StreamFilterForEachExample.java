package com.corejava.java8.features.streams;

import java.util.ArrayList;
import java.util.List;

class Employee {  
	int id;  
	String name;  

	public Employee(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  
}  

public class StreamFilterForEachExample {
	public static void main(String[] args) {

		List<Employee> employeesList = new ArrayList<Employee>();  
		
		//Adding Employee  
		employeesList.add(new Employee(101, "Pankaj"));  
		employeesList.add(new Employee(102, "Sunil"));  
		employeesList.add(new Employee(103, "Anil"));  
		employeesList.add(new Employee(104, "Ram"));  
		employeesList.add(new Employee(105, "Ravi"));  

		// This is more compact approach for filtering data  
		employeesList.stream()  
					 .filter(employee -> employee.id == 102)  
					 .forEach(employee -> System.out.println(employee.name));   
	}
}
