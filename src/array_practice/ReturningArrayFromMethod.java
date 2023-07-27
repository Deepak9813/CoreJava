package array_practice;

public class ReturningArrayFromMethod {

	static void printArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	static int[] returnArray() {
		int[] arr = {1, 2, 5, 9, 11};
		return arr;
	}

	public static void main(String[] args) {
	int[] deepak = returnArray();
	printArray(deepak);

	}

}
