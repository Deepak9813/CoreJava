//Q4> WAP to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
//Q4Triangle,  Q4 ho vanera(serially milauna sajilo hola)  vanera lekheko

package oops.classses_and_objects;

public class Q4Triangle {

	// three sides of triangle
	double a;
	double b;
	double c;

	Q4Triangle() {
		a = 3;
		b = 4;
		c = 5;
	}

	void calculateAndDisplay() {

		double perimeter = a + b + c;

		double s = perimeter / 2; // s= semi parimeter

		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println("Area of Triangle = " + area);
		System.out.println("Perimeter of Triangle = " + perimeter);
	}

}
