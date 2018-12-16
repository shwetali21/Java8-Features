package com.corejava.java8.features.collection;

import java.util.HashMap;
import java.util.Map;

//New Methods in Map
public class NewMethodsInMap {
	public static void main(String[] args) {

		Map<String, Person> map = new HashMap<>();
		map.put("101", new Person("John"));

		/**forEach()
		 * Take a BiConsumer as a parameter
		 */
		map.forEach((key, person) -> System.out.println(key + " " + person));


		/**get(key)	- older versions
		 * Drawback: p can be null 
		 * (This means either key - 101  has no value or it as a 'null' as value associated with it.) 
		 */
		Person p = map.get("101");	//p can be null
		System.out.println(p);

		//Since Java 8 
		/**getOrDefault(key, defaultvalue);
		 * Returns the default value passes as a paramater if there is no value in the map;
		 */
		Person defaultPerson = Person.DEFAULT_PERSON;
		Person person1 = map.getOrDefault("101", defaultPerson);
		System.out.println(person1);

		/**put()
		 * Automatically will erase an existing person.
		 */
		map.put("101", new Person("Herb"));
		map.forEach((key, person) -> System.out.println(key + " " + person));


		//New in JDK 8
		/**putIfAbsent(key, value)
		 * Will not erase an existing person.
		 */
		map.putIfAbsent("101", new Person("Plank"));

		map.put("103", new Person("Snape"));

		/**replace(key, person)
		 * replaces an existing value
-		 */
		map.replace("103", new Person("Severus"));


		/**replace(key, oldvalue, newvalue)
		 * replaces an existing value with new value
-		 */
		map.replace("103", map.get("103"), new Person("Albus"));


		/**replaceAll()
		 * Applies remapping function to all the existing key/values
		 */
		map.replaceAll((key, oldPerson) -> new Person("Albus"));


		/**remove()
		 * map.remove(key)	 		- JDK 7
		 * map.remove(key, value)	- JDK 8
		 */
		map.remove("103");
		map.remove("103", map.get("103"));
	}
}
