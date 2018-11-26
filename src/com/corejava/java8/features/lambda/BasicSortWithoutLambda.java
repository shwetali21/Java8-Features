package com.corejava.java8.features.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicSortWithoutLambda {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Sarah");
		emp.setId(101);

		Employee emp1 = new Employee();
		emp1.setName("Jack");
		emp1.setId(121);

		new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Sarah", 10)); 
		employees.add(new Employee("Jack", 12));

		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
	}
}
