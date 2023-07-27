package oops.abstraction.interface_practice.example1;

public class Test {
	
	public static void main(String[] args) {
		
		//up-casting
		UserService us = new UserServiceImpl();		//UserService reference but UserServiceImp object
		us.addUser();
		us.deleteUser();
		
		
		
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
