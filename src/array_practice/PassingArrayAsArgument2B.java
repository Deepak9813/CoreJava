package array_practice;

import java.util.Arrays;

public class PassingArrayAsArgument2B {
	public static void main(String[] args) {
		String[] str = { "Deepak", "Sangita", "Ram", "Sita" };
		printNames(str);

	}

	static void printNames(String[] names) {
		// printing array elements using for loop
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + ", ");
		}
		
		System.out.println();
		System.out.println("========================================================");
		
		// printing array elements using Foreach loop
		for (String n : names) {
			// System.out.println(n);
			System.out.print(n + " ,");
		}
		
		System.out.println();
		System.out.println("========================================================");
		
		
		//printing array elements[whole array] using Arrays.toString(arrayName) 
		String result = Arrays.toString(names);
		System.out.println(result);
		//if you want to write in single line then do this
		System.out.println(Arrays.toString(names));
	}
}
