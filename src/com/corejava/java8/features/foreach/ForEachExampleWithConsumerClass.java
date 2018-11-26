package com.corejava.java8.features.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExampleWithConsumerClass {
	public static void main(String[] args) {

		//Creating Collection
		List<Integer> myList = new ArrayList<>();
		for(int i = 0; i < 5; i++)
			myList.add(i+1);

		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator Value::" + i);
		}

		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer i) {
				System.out.println("forEach anonymous class Value::" + i);
			}
		});

		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

	}
}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

	public void accept(Integer i) {
		System.out.println("Consumer impl Value::"+ i);
	}
}