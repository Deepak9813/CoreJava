package oops.polymorphism.methodOverriding.example2;

public class Teacher extends Person{
	
	@Override
	void teach() {
		System.out.println("I teach Java");
	}
}
