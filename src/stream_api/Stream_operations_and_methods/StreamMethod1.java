/*
 
 filter():- 
 	collect(), forEach(), etc haru pani use vaaxan
 	
 Q1> Create a list & filter the name starting from "D" from the list.
 
 */

package stream_api.Stream_operations_and_methods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod1 {

	public static void main(String[] args) {

		// Note:- jun method baata list banayeni hunxa because stream ma operation hune
		// ho

		List<String> names = List.of("Dipak", "Dinesh", "Dixanta", "Dipesh", "Abhinav", "Ravi", "Bhawani");

		Stream<String> stream = names.stream();

		List<String> newNames = stream.filter(s -> s.startsWith("D")).collect(Collectors.toList());
		
		System.out.println(newNames);
		
	}

}
