/*
 
 a> map():- 
 	every element ma use hunxa
 	
 b> min() and max()
 	
 Q1> Create a list & square every elements of the list.
 	[note: yesma filter garnu xaina, every element lai square garnu xa. so we use map() function.]
 	
 
 */

package stream_api.Stream_operations_and_methods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod2 {

	public static void main(String[] args) throws IllegalStateException {

		List<Integer> numbers = List.of(2, 4, 5, 8, 10, 11);

		// map()
		Stream<Integer> stream = numbers.stream();

		List<Integer> newNumbers = stream.map(i -> i * i).collect(Collectors.toList());

		System.out.println(newNumbers);

		System.out.println("=========================");
		// sorted()
		Stream<Integer> stream1 = numbers.stream();
		List<Integer> sortNumbers = stream1.sorted().collect(Collectors.toList());

		System.out.println(sortNumbers);

		System.out.println("=========================");
		// min()
		Stream<Integer> stream2 = numbers.stream();

		Integer integer = stream2.min((x, y) -> x.compareTo(y)).get();
		System.out.println("Min = " + integer);

		System.out.println("=============================");

		// max()
		Stream<Integer> stream3 = numbers.stream();

		Integer integer1 = stream3.max((x, y) -> x.compareTo(y)).get();
		System.out.println("Max = " + integer1);

	}

}
