package com.corejava.java8.features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Manager {
	String name;
	int id;

	public Manager(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", id=" + id + "]";
	}
}

class Emp {  
	int id;  
	String name;  

	public Emp(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  
} 

public class StoreOnePojoToAnother {

	public static void main(String[] args) {

		List<Emp> employeesList = new ArrayList<>();  

		//Adding Employee  
		employeesList.add(new Emp(101, "Pankaj"));  
		employeesList.add(new Emp(102, "Sunil"));  
		employeesList.add(new Emp(103, "Anil"));  
		employeesList.add(new Emp(104, "Ram"));  
		employeesList.add(new Emp(105, "Ravi"));

		List<Manager> mList = employeesList.stream()
										   .map(emp -> new Manager(emp.name, emp.id))
										   .collect(Collectors.toList());
		System.out.println(mList.toString());
	}
}
