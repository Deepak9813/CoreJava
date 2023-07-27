//method having two parameter

package inner_classes.anonymous_inner_class;

//functional interface
interface Test4{
	void print(int a, int b);
}

public class Anony_lamda_With_ParaMethod1 {
	
	public static void main(String[] args) {
		
		//using lamda
		Test4 t4 = (x, y)->{
			int c = x + y;
			
			System.out.println("Printing from lamda, Total =  "+c);
		};
		t4.print(40, 20);
		
		
		/*
		Test4 t4 = (int x, int y)->{
		int c = x + y;
			
			System.out.println("Printing from lamda, Total =  "+x);
		};
		t4.print(40, 20);
		
		*/
		
		
	}
		
		
		
}
		

