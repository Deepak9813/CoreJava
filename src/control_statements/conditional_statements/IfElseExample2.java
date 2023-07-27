package control_statements.conditional_statements;

import java.util.Scanner;

public class IfElseExample2 {

	public static void main(String[] args) {
		//int age = 12;
		
		//Get input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Age :");
		int age = sc.nextInt();
		
		if(age<=15) {
			System.out.println("You cannot make passport");
		}
		else {
			System.out.println("You can make passport");
		}

	}

}