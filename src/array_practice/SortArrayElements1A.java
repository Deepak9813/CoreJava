package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayElements1A {

	public static void main(String[] args) {
		
	//	int[] data = {78, 95, 90, 88, 82, 1, 5};
		
		Scanner sc = new Scanner(System.in);
		//we can only input 5 elements in the following array because we fixed array size(or array length)[i.e length = 5]
		int[] data = new int[5];
		
		System.out.println("Enter 5 elements of array");
		for(int i=0; i<data.length; i++) {
			data[i] = sc.nextInt();
		}
	
		//sort
		Arrays.sort(data);
		
		//Printing array elements[whole array] 
		System.out.println(Arrays.toString(data));
		
		//Note: we can use for, foreach loop for printing array elements
		

	}

}
