package control_statements.conditional_statements;

import java.util.Scanner;

public class Q1EvenOdd {
	public static void main(String[] args) {
		// int num = 90;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num%2 == 0) {
			System.out.println("Even Number");
		} 
		else {
			System.out.println("Odd Number");
		}
	}

}
