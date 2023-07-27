package oops.abstraction.abstract_class_practice.example1;

public class Test {
	
	public static void main(String[] args) {
		
		
		//up-casting
		CentralBank b = new PrabhuBank();    //CentralBank reference but PrabhuBank object
		
		//CentralBank b = new NabilBank();
		//CentralBank b = new NMB();
		b.getBankName();
		b.getInterestRate(); 
		//b.moneyExchageRate(); // yo method ni call garna pauxa, it is inside CentralBank
		
		
		
		/*
		 b.getBankName();
		 b.getInterest();  ma
		 		   
		  Ctrl + single click==> implementation hide vayeko class dekhauxa
		 
		 
	
		    =======================Note: ========================================
			 jasko object le call gardai xau tyo class dekhaunu parxa[ctrl + single click] 
			 		But dekhaudaina[i.e implementation hide hunxa]
		 		
		 */
		
	}
}
