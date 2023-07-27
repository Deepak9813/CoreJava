//Note: Q1=> Question 1 ho vanera chinna lekhyeko

package oops.inheritance.inheritance_practice;

public class Q1Test {
	
	public static void main(String[] args) {
		
		//creating object for each class
		
		Q1ParentClass p = new Q1ParentClass();
		Q1ChildClass c = new Q1ChildClass();
		
		//calling methods
		
		p.print1(); 	// method of parent class by object of parent class
		c.print2();    // method of child class by object of child class
		c.print1();    //  method of parent class by object of child class
		
		
	}
}
