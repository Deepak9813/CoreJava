package array_practice;

public class PassingArrayAsArgument1 {
	
	
	static void printArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 5, 9, 11, 123, 11111};
		printArray(arr);

	}

}
