package array_practice.MultiDimensionalArray;

import java.util.Scanner;

public class SumOfTwoMatrix {
	public static void main(String[] args) {
		
		//int[][] a = new int[2][2]; //yesari lekha ni hunxa
		
		int a[][] = new int[2][2];  
		int b[][] = new int[2][2];
		
		//To store sum of two matrix, we create the following sum matrix
		int sum[][] = new int[2][2]; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements of 1st Matrix");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of 2nd Matrix");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		//sum garna ko lagi
		System.out.println("Sum of matrix: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] + "  ");
			}
			System.out.println();     //new line garna,  euta row end vaye paxi
		}
	}

}
