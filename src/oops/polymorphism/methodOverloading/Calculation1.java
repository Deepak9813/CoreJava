
//==================Method Overloading by Changing the no. of arguments(parameters)=====================

package oops.polymorphism.methodOverloading;

public class Calculation1 {
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	void sum(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}

	
	public static void main(String[] args) {
		
		Calculation1 c = new  Calculation1();
		c.sum(10, 20);
		c.sum(10, 20, 10);
		c.sum(10, 10, 20, 30);
	}
}
