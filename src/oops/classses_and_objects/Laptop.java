package oops.classses_and_objects;

public class Laptop {
	// properties
	String brand;
	String model;
	int ramSize;
	int storageSize;
	boolean isTouchscreen;
	double screenSize;

	// methods
	void displayLaptopDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("RAM Size: " + ramSize);
		System.out.println("Storage Size: " + storageSize);
		System.out.println("TouchScreen: " + isTouchscreen);
		System.out.println("Screen Size: " + screenSize);
	}
}
