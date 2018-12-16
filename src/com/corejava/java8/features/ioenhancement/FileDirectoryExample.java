package com.corejava.java8.features.ioenhancement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**Reading Directory Entries*/
public class FileDirectoryExample {
	public static void main(String[] args) {

		//Java 7: try with resources and use of Paths
		Path path = Paths.get("F:", "Notes");

		/**Method Files.list(path)	- 
		 * visits the first level entries, does not list the sub-directories.
		 */
		try(Stream<Path> stream = Files.list(path);) {

			stream.filter(p -> p.toFile().isDirectory())
			.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println(e);
		}

		/**Method Files.walk(path)	- 
		 * list the sub-directories also
		 * One can limit the depth of exploration for sub-directories - Files.walk(path, depth_limit) 
		 */
		try(Stream<Path> stream = Files.walk(path);
				Stream<Path> stream1 = Files.walk(path, 2);) {

			stream.filter(p -> p.toFile().isDirectory())
			.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
