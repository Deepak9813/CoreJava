package oops.abstraction.interface_practice.example4;

public class Test {
	
	public static void main(String[] args) {
		
		//up-casting
		StudentDetails sd = new StudentDetailsImpl(); //StudentDetails reference but StudentDetailsImpl object
		sd.showDetail("Deepak", 101, "kathmandu");
		
		
		
		/*
			sd.showDetail("Deepak", 101, "kathmandu");   	ma
	   
		Ctrl + single click==> implementation hide vayeko  dekhauxa[interface=> StudentDetails]



	=======================Note: ========================================
			jasko object le call gardai xau tyo class dekhaunu parxa[ctrl + single click] 
			 But dekhaudaina[i.e implementation hide hunxa]
	
*/
	}

}
