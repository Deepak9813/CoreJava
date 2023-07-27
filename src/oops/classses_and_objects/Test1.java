package oops.classses_and_objects;

public class Test1 {
	public static void main(String[] args) {
		
		//represent Dell laptop
		Laptop lap = new Laptop();
		
		lap.brand ="Dell";
		lap.model = "XPS 15";
		lap.ramSize = 16;
		lap.storageSize = 512;
		lap.isTouchscreen = true;
		lap.screenSize = 15.6;
		
		lap.displayLaptopDetails();
		
		System.out.println("-------------------------------------------------");
		
		//represent HP laptop
		Laptop lap1 = new Laptop();
		
		lap1.brand = "HP";
		lap1.model = "Pavilion 14";
		lap1.ramSize = 8;
		lap1.storageSize = 256;
		lap1.isTouchscreen = false;
		lap1.screenSize = 14.0;
		
		lap1.displayLaptopDetails();
		
		
	}
}
