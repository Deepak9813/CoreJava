package array_practice;

public class PassingArrayAsArgument2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 9, 11, 123, 11111};
		printArray(arr);

	}

	//static lekhye paxi mathi direct call garna pauxa same class ma, object banayera call garnu pardaina
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
