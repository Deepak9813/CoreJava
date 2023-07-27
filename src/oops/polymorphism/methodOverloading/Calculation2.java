
//================== Method Overloading by Changing the data type of arguments(parameters) =====================

package oops.polymorphism.methodOverloading;

public class Calculation2 {

	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	
	void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Calculation2 c = new Calculation2();
		c.sum(10, 20);
		c.sum(10.5, 8.7);
	}
}
