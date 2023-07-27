package java_collection.map_practice;

import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {

		// ============Another way to create Map=====================

		// name - age
		// String - Integer
		Map<String, Integer> map = Map.of("Deepak", 25, "Sachin", 24, "Bhawani", 25, "Aayush", 25, "Ravi", 22);

		// key ko base ma loop lagaune
		// forEach loop [to print details]
		for (String key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}

		System.out.println("=============forEach loop ko shortcut[lamda expression]==================");
		map.keySet().forEach(key -> System.out.println(key + " = " + map.get(key)));

	}
}
