package oops.abstraction.interface_practice.example3;

public class Test {
	
	public static void main(String[] args) {
		
		//up-casting
		CommonService cs = new UserServiceImpl(); //CommonService reference but UserServiceImpl object
		cs.addUser();
		cs.deleteUser();
		cs.print();
		
		
		
		/*
	   		cs.addUser();
			cs.deleteUser(); 	ma
		   
			Ctrl + single click==> implementation hide vayeko  dekhauxa



		=======================Note: ========================================
 			jasko object le call gardai xau tyo class dekhaunu parxa[ctrl + single click] 
 			 But dekhaudaina[i.e implementation hide hunxa]
		
*/
		
		
		
	}
}
