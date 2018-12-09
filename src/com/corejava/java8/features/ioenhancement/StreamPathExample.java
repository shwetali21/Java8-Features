package com.corejava.java8.features.ioenhancement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamPathExample {
	public static void main(String[] args) {

		//Java 7: try with resources and use of Paths
		Path path = Paths.get("D:", "tmp", "log.txt");
		try(Stream<String> stream = Files.lines(path);) {		//lines() since Java 8

			/**Stream implements AutoCloseable and will close the underlying file*/
			stream.filter(line -> line.contains("ERROR"))
			.findFirst()
			.ifPresent(System.out::println);

		} catch(IOException ioe) {
			System.out.println(ioe);
		}
	}
}
