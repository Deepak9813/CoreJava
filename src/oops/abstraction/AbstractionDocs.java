package oops.abstraction;

public class AbstractionDocs {

	
	/*
	 
	 ==============================Abstraction=====================================
	 
	 ◼ Process of hiding implementation details in the program is known as abstraction.
	 
	 ◼ To achieve abstraction, we have to use:-
	 
	 		a> Abstract class:
	 				
	 			◼ Class which contains abstract methods(unimplemented methods) and non-abstract(implemented methods) methods
	 			   is known as abstract class.
	 			
	 			◼ Abstract method: 
	 					-> Method which does not have implementation or body.
	 					
	 		Example:
				
				◼ abstract methods:
				
					abstract void add();
					
					abstract int getValue();
	 						
	 			◼ non-abstract methods[Simple  methods]:	
	 				void add()
	 				{
	 					//body
	 				}
	 				
	 				int sum(int a, int b)
	 				{
	 				
	 					//body
	 				
	 				}
	 				
	 				
	 		
	 		◼ We can't create object of abstract class.
	 		
	 		◼ Every abstract class must have at least one child class and 
	 		  child class must override abstract methods.
	 		
	 		◼ level of abstraction 0 to 100%
	 		
	 		
	 				Syntax:
	 				
	 		abstract class class_name
	 		{
	 		
	 			//abstract methods
	 			 
	 			// non-abstract methods
	 			
	 		}
	 		
	 		-------------------------------------------------------------
	 		
	 		b> Interface: 
	 			◼ same as class which contains public abstract methods and
	 			  public static final variables.
	 			  
	 			◼ We can't create object of interface.
	 			
	 			◼ every interface must have at least one implementation class and
	 				implementation class must override abstract methods.
	 				
	 			◼  100% abstraction.
	 			
	 			
	 			Syntax:
	 		interface interface_name
	 		  {
	 		
	 			//public static final variables
	 			 
	 			//public abstract methods
	 			
	 			}
	 				
	 
	 
	 */
}
