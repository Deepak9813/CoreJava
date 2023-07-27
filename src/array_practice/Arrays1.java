package array_practice;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		//defining(declaring) an array
		int[] marks = new int[5];
		
	//initializing array 
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 78;
		marks[3] = 80;
		marks[4] = 90;
		
		
		/*
		
		//=====Printing array length====
		System.out.println(marks.length);
		
		*/
		
	/*	
	  //====Printing marks[array element]====
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		*/
		
		/*
	
		//====Printing marks[array element] using for loop====
		for(int i=0; i<=marks.length-1; i++) {
			System.out.println(marks[i]);
			//System.out.print(marks[i] +" ");
		}
		System.out.println("=================================");
		
		//-1 nalekhye paxi = sign pani remove garne(i.e. i<marks.length)
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
			//System.out.print(marks[i] +" ");
		}
		
		*/
		
		
		/*
		
		//====Printing marks[array element] using Foreach loop====
		for(int m : marks) {
			System.out.println(m);
		}
		*/
		
	/*
		
		//====Printing marks[array elements] using Arrays.toString(arrayName) method. 
		//shorcut ho but Arrays class import garnu parxa
		
		System.out.println(Arrays.toString(marks));
		
		*/
		
		
		//====Change Array Elements
		marks[0] = 50;
		
		System.out.println(marks[0]);
		
		System.out.println(Arrays.toString(marks));
	}
}
