package com.corejava.java8.features.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class MergingMaps.
 */
public class MergingMaps {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		try (BufferedReader reader =
				new BufferedReader(
						new InputStreamReader(
								MergingMaps.class.getResourceAsStream("people.txt")));
				Stream<String> stream = reader.lines();
				) {

			stream.map(line -> {
				String[] s = line.split(" ");
				Person p = new Person(s[0].trim(), Integer.parseInt(s[1]), s[2].trim());
				persons.add(p);
				return p;
			}).forEach(System.out::println);

		} catch(IOException ioe) {
			System.out.println(ioe);
		}

		persons.forEach(System.out::println);

		List<Person> list1 = persons.subList(0, 4);
		List<Person> list2 = persons.subList(4, persons.size());
		
		Map<Integer, List<Person>> map1 = mapByAge(list1);
		System.out.println("Map 1: ");
		map1.forEach((age, list) -> System.out.println(age + " -> " + list));
		
		Map<Integer, List<Person>> map2 = mapByAge(list2);
		System.out.println("Map 2: ");
		map2.forEach((age, list) -> System.out.println(age + " -> " + list));
		
		//Merging maps
		map2.entrySet().stream()
					   .forEach(entry -> 
									map1.merge(
											entry.getKey(),
											entry.getValue(),
											(valueFromList1, valueFromList2) -> {
															valueFromList1.addAll(valueFromList2);
															return valueFromList1;
											})
							  );
		
		System.out.println("Merged map1: ");
		map1.forEach((age, list) -> System.out.println(age + " -> " + list));
	}

	
	
	/**
	 * Map by age.
	 * Grouping persons according to age
	 * @param list the list
	 * @return the map
	 */
	private static Map<Integer, List<Person>> mapByAge(List<Person> list) {
		Map<Integer, List<Person>> map = list.stream()
				.collect(Collectors.groupingBy(Person::getAge));
		return map;
	}
}
