package oops.classses_and_objects;

import java.util.Scanner;

public class Q1Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Q1Area a = new Q1Area();  //jata lekye ni hunxa 
		
		System.out.println("Enter the length of Rectange");
		double len = sc.nextDouble();

		System.out.println("Enter the breadth of Rectange");
		double br = sc.nextDouble();

		Q1Area a = new Q1Area();
		a.setDim(len, br);
		
		
		// double getArea(){-------} wala method lekhya vaye yo use garne
		double area = a.getArea();
		System.out.println("Area of Rectangle = " + area); 
		
		
		
		//void getArea(){---------} method vaye yo use garne
				//a.getArea(); 
	}

}
