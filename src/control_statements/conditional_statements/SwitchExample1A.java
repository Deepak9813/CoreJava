package control_statements.conditional_statements;

import java.util.Scanner;

public class SwitchExample1A {
	public static void main(String[] args) {
		//int day = 4;
		
		//Get input(no of day) from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of day");
		int day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wednesday");
			break;

		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Day");
			break;

		// break; is optional in default
		}
	}

}