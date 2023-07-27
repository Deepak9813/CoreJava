package control_statements.conditional_statements;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {

		// int x = 50;
		// int y = 20;

		// Taking user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		
		System.out.println("Enter the value of y");
		int y = sc.nextInt();

		if (x > y) {
			System.out.println("x is greater than y");
			System.out.println(x + " is  greater than " + y);

		}
	}

}
