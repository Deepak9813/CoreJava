package java_collection.map_practice.question2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Department_Student_MapTest {

	public static void main(String[] args) {

		// Department - Student
		// => String - List<Student>

		Map<String, List<Student>> map = new HashMap<>();
//		Map<String, List<Student>> map = new TreeMap<>();
//		Map<String, List<Student>> map = new LinkedHashMap<>();

		map.put("CSIT Dept.", List.of(new Student(001, "Deepak Baij", "Mahendranagar", "9813485412")));
		map.put("Engineering Dept.", List.of(new Student(002, "Sachin Bhandari", "Uk", "9858585854")));
		map.put("Education Dept.", List.of(new Student(003, "Hemant Bhatt", "Dhangadi", "9838485868")));
		map.put("Art Dept.", List.of(new Student(004, "Ram Sharma", "Dadeldhura", "9848784645")));

		// key ko base ma loop lagaune
		// forEach loop[to print details]
		for (String key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}

		System.out.println("=============forEach loop ko shortcut[lamda expression]==================");
		map.keySet().forEach(key -> System.out.println(key + " = " + map.get(key)));
	}

}
