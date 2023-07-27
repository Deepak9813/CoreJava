//Note: Q2=> Question 2 ho vanera chinna lekhyeko

package oops.inheritance.inheritance_practice;

public class Q2ChildClass extends Q2ParentClass {

	void print2() {
		System.out.println("This is child class");
	}

	public static void main(String[] args) {

		// creating object for each class

		Q2ParentClass p = new Q2ParentClass();
		Q2ChildClass c = new Q2ChildClass();

		// calling methods

		//error occur
		//p.print1(); // method of parent class by object of parent class
		
		c.print2(); // method of child class by object of child class
		
		//error occur
		//c.print1(); // method of parent class by object of child class

	}
}
