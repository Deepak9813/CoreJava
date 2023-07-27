package oops.polymorphism.methodOverriding.example3;

public class Dog extends Animal{
		
	@Override
	public void move() {
		System.out.println("Dogs can walk & run");
	}
	
	public void bark() {
		System.out.println("Dogs can bark");
	}
}
