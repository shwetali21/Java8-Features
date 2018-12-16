package com.corejava.java8.features.ioenhancement;

import java.util.Comparator;

/**New Patterns for Comparator*/
public class ComparatorExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//JDK 7
		//Comparison using lastName
		Comparator<Person> compareLastName = new Comparator<Person>() {
			//need to check if p1 or p2 is null (to avoid NullPointerException)
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		}; 

		//Comparison using lastName then the firstName
		Comparator<Person> compareLastNameThenFirstName = new Comparator<Person>() {
			//need to check if p1 or p2 is null (to avoid NullPointerException)
			@Override
			public int compare(Person p1, Person p2) {
				int lastNameComparison = p1.getLastName().compareTo(p2.getLastName());
				return lastNameComparison == 0 ? 
						p2.getFirstName().compareTo(p1.getFirstName()) : lastNameComparison;
			}
		}; 

		//JDK 8
		/**new static method comparing() which accepts keyExtractor
		 * keyExtractor (is a regular function which takes the instance of the object 
		 * the comparator will compare and extract a given field of that object)
		 */
		//Comparison using lastName
		Comparator<Person> newCompareLastName = Comparator.comparing(Person::getLastName);

		/**thenComparing() - 
		 * default method of the Interface - Comparator
		 */
		//Comparison using lastName then the firstName
		Comparator<Person> newCompareLastNameThenFirstName = Comparator.comparing(Person::getLastName)
				.thenComparing(Person::getFirstName);


		/**reversed() - Reverse a given comparator */
		Comparator<Person> reversedComp = newCompareLastName.reversed();

		/**Natural Comparator - naturalOrder()
		 * Compares two comparable objects 
		 * alphabetical order
		 */
		Comparator<String> c = Comparator.naturalOrder();

		/**Null check for Comparator - nullsFirst()*/
		//Consider null values lesser than non-null values
		Comparator<String> nullValuesFirst = Comparator.nullsFirst(Comparator.naturalOrder());

		/**Null check for Comparator - nullsLast()*/
		//Consider null values greater than non-null values
		Comparator<String> nullValuesLast = Comparator.nullsLast(Comparator.naturalOrder());
	} 
}
