package oops.classses_and_objects;

import java.util.Scanner;

public class Q10Test {
	public static void main(String[] args) {
		//first employee
		Q10Employee e1 = new Q10Employee();
		e1.name = "Robert";
		e1.year_of_joining = 1994;
		e1.address = "64C- WallsStreat";
		e1.salary = 1000000;
		
		//second employee
		Q10Employee e2 = new Q10Employee();
		e2.name = "Sam";
		e2.year_of_joining = 2000;
		e2.address = "68D- WallsStreat";
		e2.salary = 500000;
		
		
		//calling methods
		e1.displayEmployeeInfo();
		e2.displayEmployeeInfo();
		
		
	}

}
