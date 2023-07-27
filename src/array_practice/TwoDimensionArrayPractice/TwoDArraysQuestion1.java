package array_practice.TwoDimensionArrayPractice;

import java.util.Scanner;

public class TwoDArraysQuestion1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of columns");
		int cols = sc.nextInt();

		int[][] numbers = new int[rows][cols];

		System.out.println("Enter the elements of 2D Array");
		// Input [elements input garna ko lagi loop]
		// rows
		for (int i = 0; i < rows; i++) {
			// cols
			for (int j = 0; j < cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}

		// Search ko lagi
		System.out.println("Enter the search element");
		int x = sc.nextInt();

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				if (numbers[i][j] == x) {
					// System.out.println("x found at location (" + i + "," + j + ")");
					System.out.println(x + " found at location (" + i + "," + j + ")");
				}
			}
		}

	}

}
