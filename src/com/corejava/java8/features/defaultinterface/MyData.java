package com.corejava.java8.features.defaultinterface;

public interface MyData {

	/* This is a default method so we need not
	 * to implement this method in the implementation 
	 * classes  
	 */
	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	/* This is a static method. Static method in interface is
	 * similar to default method except that we cannot override 
	 * them in the implementation classes.
	 * Similar to default methods, we need to implement these methods
	 * in implementation classes so we can safely add them to the 
	 * existing interfaces.
	 */
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return null != str && str.isEmpty();
	}
}
