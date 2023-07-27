package oops.classses_and_objects;

import java.util.Scanner;

public class Test1A {
	public static void main(String[] args) {
		
		//Get input from user
		Scanner sc = new Scanner(System.in);
		
		Laptop lap = new Laptop();
		
		System.out.println("Enter the Brand Name");
		lap.brand = sc.next();
		//lap.brand = "Dell";
		
		System.out.println("Enter the model number");
		lap.model = sc.next();
		//lap.model = "XPS 15";
		
		System.out.println("Enter  the RAM Size");
		lap.ramSize = sc.nextInt();
		//lap.ramSize = 16;
		
		System.out.println("Enter the Storage Size");
		lap.storageSize = sc.nextInt();
		//lap.storageSize = 512;
		
		System.out.println("Is it Touchscreen ? enter true or false ");
		lap.isTouchscreen = sc.nextBoolean();
		//lap.isTouchscreen = true;
		
		System.out.println("Enter the Screen Size");
		lap.screenSize = sc.nextDouble();
		//lap.screenSize = 15.6;
		
		lap.displayLaptopDetails();
		
		
		
		
	}
}
