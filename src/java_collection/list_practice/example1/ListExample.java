package java_collection.list_practice.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		//List<String> names = new ArrayList<>();
		List<String> names = new LinkedList<>();
		
		
		// adding elements to ArrayList [Note(in nepali)=> jasko object create hunxa tyo class ma add hunxa, so ArrayList ma elements add hudai xan]
		names.add("Deepak Baij");
		names.add("Rohit Bhatt");
		names.add("Bhawani Bist");
		names.add("Ravi Shah");
		
		// adding multiple data[elements] at a time
		names.addAll(List.of("Sangita Paneru", "Meena Singh", "Pooja Pant"));
		
		
		//remove
		names.remove(5);					//by index	[Meena Singh remove hunxa]
		names.remove("Rohit Bhatt");		//by name(element name) [Rohit Bhatt] remove huxa]
		
		//sort
		Collections.sort(names);
	
		
		// forEach loop[to print details(all elements)]
		for(String n: names) {
			System.out.println(n);
		}
		
		System.out.println("======forEach ko arko shortcut[lamda expression]======");
		names.forEach(n-> System.out.println(n));
	}

}
