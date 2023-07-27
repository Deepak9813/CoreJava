package java_collection.list_practice;

import java.util.Collections;
import java.util.List;

public class ListTest1 {
	
	public static void main(String[] args) {
		
		//===========Another way to create list=====================
		
		List<Integer> list = List.of(1, 3, 45, 3, 78, 55, 45, 67, 78, 92, 100, 21, 4, 45, 35);
		
		
		//forEach loop [to print all elements of list]
		for(Integer l: list) {
			System.out.println(l);
		}
		
		System.out.println("======forEach ko arko shortcut[lamda expression]======");
		list.forEach(l-> System.out.println(l));
		
		
		//Note: yesari create garye sort garna sakidaina[Immutable] [i.e Collections.sort(list); error aauxa yeta]
		
	}
	

}
