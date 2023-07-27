package array_practice;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		//user input array
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		//element input garna ko lagi loop
		for(int i=0; i<size; i++) {
			System.out.println("Enter the elements of array");
			numbers[i] = sc.nextInt();
			
		}
		
		//output ko lagi
		for(int i=0; i<size; i++) { 
			System.out.println(numbers[i]);
		}
	
	}
}
