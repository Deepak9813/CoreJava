package java_collection.set_practice;

import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {

		// =================Another way to create Set===================

		// Set<Integer> set = Set.of(1, 2, 5,3, 2, 7, 9, 11, 333, 444, 121, 444, 22, 87);
		// Note: yesari banaye=> duplicate data accept gardaina[previous method[MapTest.java] bata garne duplicate data insert garne vaye]

		Set<Integer> set = Set.of(1, 2, 5, 4, 6, 11, 22, 33, 44);

		// forEach loop [to print details]
		for (Integer s : set) {
			System.out.println(s);
		}

		System.out.println("==========forEach loop shortcut[lamda expression]===========");
		set.forEach(s -> System.out.println(s));
	}

}
