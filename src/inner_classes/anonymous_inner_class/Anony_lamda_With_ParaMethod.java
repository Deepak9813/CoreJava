//method having one parameter

package inner_classes.anonymous_inner_class;

//functional interface
interface Test3{
	void print(int a);
}

public class Anony_lamda_With_ParaMethod {
	
	public static void main(String[] args) {
		
		//using lamda
		Test3 t3 = (x)->{
			
			System.out.println("Printing from lamda, a =  "+x);
		};
		t3.print(40);
		
		
		/*
		Test3 t3 = (int x)->{
			
			System.out.println("Printing from lamda, a =  "+x);
		};
		t3.print(40);
		
		*/
		
		
	}
		
		
		
	}
		
