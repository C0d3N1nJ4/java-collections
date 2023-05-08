package com.linkedin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {

		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.00);

		System.out.println("=====================================");
		System.out.println("Practice with HashSet");

		//Won't print the sequence or order that the rooms were added into the Set
		Set<Room> rooms = new HashSet<>();
		rooms.add(piccadilly);
		rooms.add(oxford);
		rooms.add(oxford);
		rooms.add(oxfordDuplicate);

		rooms
				.stream()
				.map(r -> r.getName())
				.forEach(System.out::println);

		System.out.println("=====================================");
		System.out.println("Practice with LinkedHashSet");

		//Will print the sequence or order that the rooms were added into the Set
		Set<Room> MoreRooms = new LinkedHashSet<>();
		MoreRooms.add(piccadilly);
		MoreRooms.add(oxford);
		MoreRooms.add(oxford);
		MoreRooms.add(oxfordDuplicate);

		MoreRooms
				.stream()
				.map(r -> r.getName())
				.forEach(System.out::println);

		System.out.println("=====================================");
		System.out.println("Practice with Set.of - Immutable Set");

		Set<Room> rooms2 = Set.of(piccadilly, oxford);
		rooms2.add(victoria);
	}
}
