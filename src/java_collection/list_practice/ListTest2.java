package java_collection.list_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {

		// ===========Another way to create list=====================

		List<Integer> list = Arrays.asList(1, 3, 45, 3, 78, 55, 45, 67, 78, 92, 100, 21, 4, 45, 35);

		//sort[sort garna milxa yesari list banaye]
		Collections.sort(list);
		
		

		//forEach loop [to print all elements of list]
		for(Integer l: list) {
			System.out.println(l);
		}
		
		System.out.println("======forEach ko arko shortcut[lamda expression]======");
		list.forEach(l-> System.out.println(l));
		
		
		System.out.println("=============================");
		
		//print ta direct garda ni hunxa[but traverse garna sakidaina]
		System.out.println(list);
	}

}
