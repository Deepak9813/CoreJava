package stream_api.create_stream_object;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

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

		// Note : list jasari banayeni hunxa because ==> stream ma opereation garne hau

		Stream<Integer> stream = list.stream();
		

		
//		stream.forEach(s-> {
//			System.out.println(s);
//		});
		
		System.out.println(stream);
	}

}
