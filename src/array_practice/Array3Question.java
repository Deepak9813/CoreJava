package array_practice;

import java.util.Scanner;

public class Array3Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();

		int numbers[] = new int[size];

		// element input garna ko lagi loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter the  elements of an array");
			numbers[i] = sc.nextInt();
		}

		// number search garna ko lagi first user baata number input linay
		System.out.println("Enter the x value");
		int x = sc.nextInt();

		// output ko lagi[using for loop]
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				System.out.println("x found at index : " + i);
			}
		}

	}

}
