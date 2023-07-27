
//=================ArrayList/LinkedList[class] implements List [interface]=======================

package java_collection.list_practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		 List<String> list = new ArrayList<>();
		//List<String> list = new LinkedList<>(); // ArrayList & LinkedList ko methods sabai same xan

		// adding elements to ArrayList [Note(in nepali)=> jasko object create hunxa tyo class ma add hunxa, so ArrayList ma elements add hudai xan]
		list.add("Nepal");
		list.add("Japan");
		list.add("Korea");
		list.add("Canada");

		// adding multiple data[elements] at a time
		list.addAll(List.of("USA", "UK", "France", "Germany"));

		// remove elements
//		list.remove(2);				//by index   [Korea remove hunxa]
//		list.remove("France");		//by element name

		//System.out.println("=====clear all items of array[elements print garnu vanda agaadi use garye paxi clear vaako dekhinxa, if paxi clear garye feri for loop lagayera elements print garne, feri dekhinxa clear vaako(elements print hudaina because clear(remove) vaisakyo sabai elements)]=================");
		//clear all items of array
				//list.clear();
		
		
		
		// forEach loop[to print details(all elements)]
		for (String l : list) {
			 System.out.println(l);
			// System.out.print(l+" ");
			//System.out.print(l + ", ");
		}
		
		//System.out.println();
		System.out.println("======forEach ko arko shortcut[lamda expression]======");
		list.forEach(l-> System.out.println(l));
		//list.forEach(l-> System.out.print(l +" " ));

		
		System.out.println("=============contains[elements check garna]=================");

		// contains [elements list ma xa ki xaina vanera check garna]
		System.out.println(list.contains("Japan")); // true
		System.out.println(list.contains("Bhutan")); // false

		// same ho but two line ma lekheko
		boolean x = list.contains("India");
		System.out.println(x); // false

		System.out.println("================================");

		
	}
}
