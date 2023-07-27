package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2A {

	public static void main(String[] args) {
		//user input array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		//element input garna ko lagi loop
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Enter the elements of array");
			numbers[i] = sc.nextInt();
			
		}
		
	/*
		//output ko lagi[using for loop]
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	
	*/
		/*
		
		//output ko lagi[using Foreach loop]
		for(int n : numbers) {
			System.out.println(n);
		}
		*/
		
		//output ko lagi[using Arrays.toString(arrayName)]
		System.out.println(Arrays.toString(numbers));
	}
}

