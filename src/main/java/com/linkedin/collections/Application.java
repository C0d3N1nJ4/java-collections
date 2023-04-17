package com.linkedin.collections;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>();
		c.add("One");
		c.add("Two");
		c.add("Three");
		c.add("Two");
		Collection<String> things = new HashSet<>(c);

		System.out.println(c);
		System.out.println(things);



		
	}

}
