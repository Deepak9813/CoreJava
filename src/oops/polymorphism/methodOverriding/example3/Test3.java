package oops.polymorphism.methodOverriding.example3;

public class Test3 {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();	//Animal reference & object
		a.move(); 					//Animals can move
		
		
		//up-casting 
		Animal a1 = new Dog();	//Animal reference but Dog object
		a1.move(); 				//Dogs can walk & run
	//	a1.bark();			//Error[because there is no bark() method in Animal class]
		
		System.out.println("==================================");
		Dog d = new Dog();		//Dog reference & object
		d.move();				//Dogs can walk & run
		d.bark(); 				//Dogs can bark
	}

}
