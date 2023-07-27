/*
 
	4.
		Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to 
		print the area and perimeter of the rectangle respectively. Its constructor having parameters for length 
		and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 
		'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor 
		of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
		 
 
 //Note: Q4=> Question 4 ho vanera chinna lekhyeko

 
 */

package oops.inheritance.inheritance_practice;

public class Q4Rectange {

	// create two data members
	double length;
	double breadth;

	// create two methods according to question
	double printArea() {
		return length * breadth;
	}

	double printPerimeter() {
		return 2 * (length + breadth);
	}

	// create constructor according to question[Note: ali mathi lekha better dekhinxa]
	Q4Rectange(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	
}
