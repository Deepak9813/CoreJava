package java_collection.map_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		
		//subject - marks
		//Map<String, Integer> map = new HashMap<>();
		//Map<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		
		map.put("Math", 90);
		map.put("English", 92);
		map.put("Computer", 94);
		map.put("Science", 95);
		
		
		
		//key ko base ma loop lagaune
		//forEach loop [to print details]
		for(String key: map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
		
		System.out.println("=============forEach loop ko shortcut[lamda expression]==================");
		map.keySet().forEach(key -> System.out.println(key + " = " + map.get(key)));
		
		/*
		 * homework:
		 Q1>
		 	BrandName - Product
		 	String - List<Product>
		 	
		 	------------------
		 	Q2> Department - Student
		 		String 	   - List<Student>
		 	
		 	
		 */
		
	}

}
