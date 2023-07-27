/*
		================= Question baata clear hunxa ====================
		
		Q> Create a List and Filter all even numbers from list
 
 
 */

package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {

		// List<Integer> list = List.of(2, 4, 50, 49, 30); //Immutable list[duplicate ,
		// add, remove not allowed]

		// List<Integer> list = Arrays.asList(2, 4, 50, 49, 30); //Immutable
		// list[duplicate , add, remove not allowed]

		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(4);
		list.add(50);
		list.add(49);

		// add multiple elements at a time
		list.addAll(List.of(2, 3, 55, 88, 50));

		// without stream
		List<Integer> listEven = new ArrayList<>();

		for (Integer i : list) {

			if (i % 2 == 0) {
				listEven.add(i);
			}
		}

		System.out.println(list);
		System.out.println(listEven);

		// Using Stream API [even filter garna]
		System.out.println("========================Using Stream========================");

		Stream<Integer> stream = list.stream();
		List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(newList);

	 
	}

}
