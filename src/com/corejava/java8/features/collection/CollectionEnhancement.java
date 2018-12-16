package com.corejava.java8.features.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**New methods on List
 * forEach(), removeIf(), replaceAll(), sort()
 */
public class CollectionEnhancement {
	public static void main(String[] args) {

		//forEach() - Cannot be used with arrays.
		List<String> strings = Arrays.asList("one", "two", "three");
		strings.forEach(System.out::println);

		System.out.println();

		/**removeIf()
		 * Removes an element on a predicate
		 * will not work if list is unmodifiable
		 * returns true if the list has been modified
		 */
		Collection<String> str = Arrays.asList("one", "two", "three", "four");
		Collection<String> list = new ArrayList<>(str);
		list.forEach(System.out::println);

		boolean b = list.removeIf(s -> s.length() > 4);
		System.out.println("Element removed ? : " + b);

		System.out.println(list.stream().collect(Collectors.joining(", ")));

		System.out.println();

		/**replaceAll()
		 * Removes an element on a predicate
		 * will not work if list is unmodifiable
		 * doesn't return anything
		 */
		strings.replaceAll(String::toUpperCase);
		System.out.println(strings.stream().collect(Collectors.joining(", ")));

		System.out.println();

		/**sort()
		 * Removes an element on a predicate
		 * will not work if list is unmodifiable
		 * doesn't return anything
		 */
		strings.sort(Comparator.naturalOrder());
		System.out.println(strings.stream().collect(Collectors.joining(", ")));
	}
}
