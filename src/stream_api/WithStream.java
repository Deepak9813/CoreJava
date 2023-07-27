/*
 
 ==========================With Stream vs Without StreamCode Comparision ========================
 
 Q1> Create a List & Filter all even numbers from list.
 
 
 */

package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStream {

	public static void main(String[] args) {

//		List<Integer> list = List.of(2, 4, 50, 49, 30);			//Immutable
//		List<Integer> list = Arrays.asList(2, 4, 50, 49, 30);	//Immutable [duplicate, add, remove not allowed in list]

		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(4);
		list.add(50);
		list.add(49);
		list.add(30);

		// add multiple elements at one time
		list.addAll(List.of(2, 3, 55, 88, 50));

		// using stream API
		// 1st stream nikalne then filter garne

		Stream<Integer> stream = list.stream();

		List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(list);   //yetikai print gareko list, change k k vayo vanera herna
		System.out.println(newList);
		
		
		System.out.println("======================");
		
		
		//one(single) line ma ni lekhna sakxau
		List<Integer> newList1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(list);   
		System.out.println(newList1);
		
		

	}

}
