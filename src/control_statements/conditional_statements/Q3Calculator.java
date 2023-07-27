//WAP to create a calculator using switch case  

package control_statements.conditional_statements;

import java.util.Scanner;

public class Q3Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Select Symbol(+, -, *, /");
		String sym = sc.next();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		int result;
		
		switch(sym) {
		case "+":
			result = num1 + num2;
			System.out.println("Addition = "+result);
			break;
			
		case "-":
			result = num1 - num2;
			System.out.println("Subtraction = "+result);
			break;
			
		case "*":
			result = num1 * num2;
			System.out.println("Multiplication = "+result);
			break;
			
		case "/":
			result = num1 / num2;
			System.out.println("Division = "+result);
			break;
			
		default:
			System.out.println("Invalid symbol/input");
			break;
		}
		
	}

}
