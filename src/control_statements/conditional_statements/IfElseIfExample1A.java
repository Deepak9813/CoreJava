//WAP to take find the greatest number among three numbers.

package control_statements.conditional_statements;

import java.util.Scanner;

public class IfElseIfExample1A {

	public static void main(String[] args) {
	//	int a = 5;
	//	int b = 4;
	//	int c = 2;
		
		//Get Input from User
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		System.out.println("Enter the value of c:");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c){
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}
}
