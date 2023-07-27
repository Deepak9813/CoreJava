package java_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
	
	//=================Shorcut[List, Set, Map] yesari pani banauna sakxau =================
	
	public static void main(String[] args) {
		
	Map<String, Integer>  map =	Map.of("Ram",20, "Hari", 30, "Deepak", 25);

	List<Integer> list = List.of(1, 5, 2, 55, 34, 3, 2, 1);
	
	Set<Integer> set = Set.of(1, 5, 2, 55, 34, 3, 2, 1);
	
	System.out.println("============Map==================");
	
	//forEach loop for map
	for(String key: map.keySet()) {
		System.out.println(key);
	}
	System.out.println("======================================");
	//shortcut[forEach loop] for map
	map.keySet().forEach(key->System.out.println(map.get(key)));
	
	System.out.println("=============List============");
	
	//forEach loop for list
	for(Integer l: list) {
		System.out.println(l);
	}
	
	//shortcut[foreach loop ko] list
	
	list.forEach(l-> System.out.println(l));
	
	}	
}
