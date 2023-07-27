package array_practice;

import java.util.Arrays;

public class PassingArrayAsArgument2A {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 9, 11, 123, 11111};
		printArray(arr);

	}

	// static lekhye paxi mathi direct call garna pauxa same class ma, object
	// banayera call garnu pardaina
	static void printArray(int[] a) {

		/*
		 * for (int i = 0; i < a.length; i++) { System.out.print(a[i] + " "); }
		 * 
		 */

		
		/*
		 // Foreach loop use garda ni hunxa
		for (int deepak : a) {
			// System.out.println(deepak);
			System.out.print(deepak + " ");
		}
		*/
		//Arrays.toString(arrayName) use garera garda ni hunxa, loop jastai kaam gara
		System.out.println(Arrays.toString(a));
	}

}
