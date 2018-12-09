package com.corejava.java8.features.ioenhancement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class StreamReaderExample {
	public static void main(String[] args) {

		//Java 7: try with resources
		try (BufferedReader reader = 
				new BufferedReader(
						new FileReader(
								new File("F:/tmp/log.txt")));) {

			Stream<String> stream = reader.lines();	//new method lines() since java 8
			/**lines() method opens a stream of string on that reader. 
			 * This stream is a stream on each element i.e. a line in the file.
			 * Reader.lines() opens a stream on the file 
			 * and every element of that stream is a single line in the file  */

			stream.filter(line -> line.contains("ERROR"))
			.findFirst()
			.ifPresent(System.out::print);

		} catch(IOException ioe) {
			System.out.println(ioe);
		}
	}
}
