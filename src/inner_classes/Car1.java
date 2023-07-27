/*
 
 ===========================static inner class=======================
 Note[in Nepali]:
  		Inner class static xa vanye, Outer class ko properties(variables)
 		lai static bananu parxa.. Otherwise error occurs.
 
 
 */

package inner_classes;

public class Car1 {
	
	static String color;
	static String model;
	static int price;
	
	
	static class Engine{
		int cc;
		int number;		//engineNumber
		String type;
		
		void print() {
			System.out.println("CC = "+cc);
			System.out.println("Number = "+number);
			System.out.println("Type = "+type);
			
			System.out.println("Color = "+color);
			System.out.println("model = "+model);
			System.out.println("Price = "+price);
		}
		

}
	
	public static void main(String[] args) {
		
		Car1 c = new Car1();
		c.color = "Red";
		c.model = "BM900";
		c.price = 900000000;
		
		
		Car1.Engine eng = new Engine();
		eng.cc = 600;
		eng.number = 345465;
		eng.type = "Petrol";
		
		eng.print();  //calling method
	}
	
}
