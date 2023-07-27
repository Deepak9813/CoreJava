package inner_classes;

public class Car {
	
	String color;
	String model;
	int price;
	
	
	class Engine{
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
		
		Car c = new Car();
		c.color = "Red";
		c.model = "BM900";
		c.price = 900000000;
		
		
		Car.Engine eng = c.new Engine();
		eng.cc = 600;
		eng.number = 345465;
		eng.type = "Petrol";
		
		eng.print();  //calling method
	}
	
}
