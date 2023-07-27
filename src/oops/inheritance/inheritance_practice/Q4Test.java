//Note: Q4=> Question 4 ho vanera chinna lekhyeko

package oops.inheritance.inheritance_practice;

public class Q4Test {

	public static void main(String[] args) {
		Q4Rectange r = new Q4Rectange(7, 9);
		Q4Square s = new Q4Square(5);

		System.out.println("==================Rectangle Info==================");
		System.out.println("Area = " + r.printArea());
		System.out.println("Perimeter = " + r.printPerimeter());

		System.out.println("==================Square Info==================");
		System.out.println("Area = " + s.printArea());
		System.out.println("Perimeter = " + s.printPerimeter());

	}
}
