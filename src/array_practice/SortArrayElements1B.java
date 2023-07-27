package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayElements1B {

	public static void main(String[] args) {

		// int[] data = {78, 95, 90, 88, 82, 1, 5};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		
		int[] data = new int[size];

		// System.out.println("Enter the elements of array");
		System.out.println("Enter " + size + " elements of array");
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}

		// sort
		Arrays.sort(data);

		// Printing array elements[whole array]
		System.out.println(Arrays.toString(data));

		// Note: we can use for, foreach loop for printing array elements

	}

}
