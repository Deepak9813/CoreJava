package array_practice;

import java.util.Arrays;

public class ReturningArrayFromMethod1 {
	
	
	static int[] returnArray() {
		int[] arr = {1, 2, 5, 9, 11, 11111};
		return arr;
	}

	public static void main(String[] args) { 
		
		int[] deepak = returnArray();
		
		//print garna array elements[whole array]
		System.out.println(Arrays.toString(deepak));
		
		//for loop, Foreach loop lagayera print garda ni hunxa
	}

}
