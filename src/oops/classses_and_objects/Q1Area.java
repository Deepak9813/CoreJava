//Q1> WAP to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Lenght and breadth of rectangle are entered through keyboard.
//Q1Area,  Q1 ho vanera(serially milauna sajilo hola)  vanera lekheko

package oops.classses_and_objects;

public class Q1Area {

	double length;
	double breadth;
	

	// set dimension
	void setDim(double l, double b) {
		length = l;
		breadth = b;
	}

	// print(get Area)
	public	double getArea() {
		double area = length * breadth;
		return area;
	}

	// ==============OR[question ma return vanya xa tesaile mathi return wala lekhye better hunxa]==========

	// print(get Area)
	/*
	 * void getArea() {
	 *  double area = length * breadth;
	 * 
	 * System.out.println("Area of Rectange : " + area); }
	 */
}
