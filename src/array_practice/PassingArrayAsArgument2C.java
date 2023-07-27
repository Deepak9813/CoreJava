package array_practice;

public class PassingArrayAsArgument2C {

	public static void main(String[] args) {
		int[] marks = { 78, 98, 68, 77, 89, 90 };
		deepak(marks);

	}

	// here deepak is a method name, you can write any name but must follow Camel Case
	static void deepak(int[] input) {
		// printing elements of array using for loop
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
