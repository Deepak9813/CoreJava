package oops.abstraction.interface_practice.example2;

public class Test {
	
	public static void main(String[] args) {
		
		//up-casting
		UserService us = new UserServiceImpl(); //UserService reference but UserServiceImpl object
		us.addUser();
		us.deleteUser();
		us.print();
		
		
		
		/*
	   		us.addUser();
			us.deleteUser(); 	ma
		   
			Ctrl + single click==> implementation hide vayeko  dekhauxa[interface=> UserService]



		=======================Note: ========================================
 			jasko object le call gardai xau tyo class dekhaunu parxa[ctrl + single click] 
 			 But dekhaudaina[i.e implementation hide hunxa]
		
*/
		
		
		
	}
}
