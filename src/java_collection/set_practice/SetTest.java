package java_collection.set_practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

//		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();

		set.add("Kathmandu");
		set.add("Pokhara");
		set.add("Dhangadi");
		set.add("Kathmandu");
		set.add("Dang");
		set.add("Palpa");
		set.add("Kathmandu");
		set.add("Surkhet");
		set.add("Rolpa");
		set.add("Pokhara");
		set.add("Dang");

		// forEach loop [to print details(all elements)]
		for (String s : set) {
			System.out.println(s);
		}

		System.out.println("===========forEach loop shortcut[lamda expression]====================");

		set.forEach(s -> System.out.println(s));

	}

}
