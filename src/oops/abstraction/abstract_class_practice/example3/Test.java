package oops.abstraction.abstract_class_practice.example3;

public class Test {
	
	public static void main(String[] args) {
		
		//up-casting
		Shape s = new Square(); 		//Shape reference but Square object
		//Shape s = new Rectangle();
		//Shape s = new Circle();
		
		s.draw();
		
		
		/*
	  	   	s.draw(); 	ma
	 		   
	  Ctrl + single click==> implementation hide vayeko class dekhauxa
	 
	

	    =======================Note: ========================================
		 jasko object le call gardai xau tyo class dekhaunu parxa[ctrl + single click] 
		 		But dekhaudaina[i.e implementation hide hunxa]
	 		
	 */
	}
}
