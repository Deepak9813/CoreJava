package array_practice.MultiDimensionalArray;

import java.util.Scanner;

public class MultiDimensionArray1B {
	public static void main(String[] args) {
		// int[][] mat = new int[2][2]; 
		// int mat[][] = new int[2][2];  //yesari lekhye ni hunxa.
		
		
		//Get rows, columns and elements of array(matrix)0  from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of columns");
		int cols = sc.nextInt();
		
		int[][] mat = new int[rows][cols];
		
		System.out.println("Enter the Elements of Array(matrix)");
		//Write data in array
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				//mat[i][j] = 50;
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Read data from array
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();  //new line garna,  euta row end vaye paxi
		}
	}

}
