//Q5> WAP to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three side as its parameters.
//Q5Triangle,  Q5 ho vanera(serially milauna sajilo hola)  vanera lekheko

package oops.classses_and_objects;

public class Q5Triangle {

	// three sides of triangle
		double a;
		double b;
		double c;

		Q5Triangle(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		void calculateAndDisplay() {

			double perimeter = a + b + c;

			double s = perimeter / 2; // s= semi parimeter

			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

			System.out.println("Area of Triangle = " + area);
			System.out.println("Perimeter of Triangle = " + perimeter);
		}
}
