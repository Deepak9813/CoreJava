package array_practice;

import java.util.Arrays;

public class ReturningArrayFromMethod1A {
	public static void main(String[] args) {
		String[] str = returnArray();

		// print garna array elements[whole array]
		System.out.println(Arrays.toString(str));

		// for loop, Foreach loop lagayera print garda ni hunxa

	}

	static String[] returnArray() {
		String[] names = { "Deepak", "Sangita", "Ram", "Sita" };
		return names;
	}

}
