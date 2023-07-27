/*

//Note: MultiDimensional Array: 
	1. Use to store and processing data in rows and columns form(or matrix form or table form).
	2.The simplest multi-dimensional array is 2D array.
	
		syntax
	data_type[][] array_name = new data_type[rows][cols];


*/

package array_practice.MultiDimensionalArray;

public class MultiDimensionArray1 {
	public static void main(String[] args) {
		int[][] mat = new int[2][2]; 
	//  int mat[][] = new int[2][2];  //yesari lekhye ni hunxa.
		
		
		//Write data in array
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				mat[i][j] = 50;
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
