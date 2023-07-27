package inner_classes.anonymous_inner_class;

//functional interface
interface Test5 {

	int print(int a, int b);
}

public class Anony_lamda_With_ReturnTypeMethod {

	public static void main(String[] args) {

		// using lamda(->)

		Test5 t5 = (x, y) -> {
			int c = x + y;
			return c;
		};
		int result = t5.print(40, 20);
		System.out.println("Total = " + result);

	}

}
