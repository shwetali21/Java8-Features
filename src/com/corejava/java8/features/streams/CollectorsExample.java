package com.corejava.java8.features.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		try(
				BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(
								CollectorsExample.class.getResourceAsStream("people.txt")));
				Stream<String> stream = reader.lines();
				) {

			stream.map(line -> {
				String[] s = line.split(" ");
				Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
				persons.add(p);
				return p;
			}).forEach(System.out::println);

		} catch(IOException ioe) {
			System.out.println(ioe);
		}

		Stream<Person> stream = persons.stream();

		Optional<Person> optPerson = stream.filter(p -> p.getAge() >= 20)
				.min(Comparator.comparing(Person::getAge)); 

		System.out.println(optPerson);

		//Oldest Person
		/*Optional<Person> oldPerson = stream.max(Comparator.comparing(Person::getAge));
		System.out.println(oldPerson);*/

		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		//Once a stream is used, it cannot be reused for another operation
		Optional<Person> oldPerson = persons.stream().max(Comparator.comparing(Person::getAge));
		System.out.println(oldPerson);

		//Collectors - Map
		Map<Integer, List<Person>> map = persons.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println(map);

		Map<Integer, Long> mapWithCount = persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		System.out.println(mapWithCount);

		//Collectors - Set
		Map<Integer, Set<String>> mapWithSet = 
				persons.stream()
				.collect(
						Collectors.groupingBy(Person::getAge, Collectors.mapping(
								Person::getName, Collectors.toCollection(TreeSet::new))));

		System.out.println(mapWithSet);

		//Collectors - Integer, String map
		Map<Integer, String> mapWithString = 
				persons.stream()
				.collect(
						Collectors.groupingBy(Person::getAge, Collectors.mapping(
								Person::getName, Collectors.joining(","))));

		System.out.println(mapWithString);

	}
}
