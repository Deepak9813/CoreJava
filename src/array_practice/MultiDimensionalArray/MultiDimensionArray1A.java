package array_practice.MultiDimensionalArray;

import java.util.Scanner;

public class MultiDimensionArray1A {
	public static void main(String[] args) {
		int[][] mat = new int[2][2]; 
	//  int mat[][] = new int[2][2];  //yesari lekhye ni hunxa.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Elements of Array(matrix)");
		//Write data in array
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				//mat[i][j] = 50;
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Read data from array
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();  //new line garna,  euta row end vaye paxi
		}
	}

}
