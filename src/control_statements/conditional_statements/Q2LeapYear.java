package control_statements.conditional_statements;

import java.util.Scanner;

public class Q2LeapYear {
	public static void main(String[] args) {
		//int year = 2017;
		
		//Get input(year) from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		
		if(year%400 == 0) {
			System.out.println("Leap Year");
		}
		else if(year%4 == 0 && year%100 != 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}



/*

//Note : leap year ko lagi 2 condition hunxa[kunai ek condition true vaye leap year hunxa]
	1. 400 le proper divide hunuparxa.[ie. year%400 == 0]
			&
	2. 4 le proper divide hunuparyo but 100 le proper divide hunu vayena[i.e year%4 == 0 && year%100 != 0]

*/