package java_collection.map_practice.question1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BrandName_Product_MapTest {

	public static void main(String[] args) {

		// BrandName - Product
		// String - List<Product>
		Map<String, List<Product>> map = new HashMap<>();
		//Map<String, List<Product>> map = new TreeMap<>();
		//Map<String, List<Product>> map = new LinkedHashMap<>();

		map.put("Apple", List.of(new Product(101, "Mobile", 90000)));
		map.put("Dell", List.of(new Product(102, "Laptop", 75000)));
		map.put("Honda", List.of(new Product(103, "Bike", 500000)));
		map.put("BMW", List.of(new Product(104, "Car", 9000000)));

		// key ko base ma loop lagaune
		// forEach loop[to print details]
		for (String key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}

		System.out.println("=============forEach loop ko shortcut[lamda expression]==================");
		map.keySet().forEach(key -> System.out.println(key + " = " + map.get(key)));
	}

}
