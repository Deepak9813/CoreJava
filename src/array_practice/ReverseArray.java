package array_practice;

public class ReverseArray {

	public static void main(String[] args) {
		int[] data = { 7, 9, 11, 13 };

		// reverse garna
		for (int i = data.length - 1; i >= 0; i--) {
			System.out.print(data[i] + ", ");
		}
	}

}
