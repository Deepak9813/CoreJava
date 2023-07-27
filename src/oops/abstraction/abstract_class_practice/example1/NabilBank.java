package oops.abstraction.abstract_class_practice.example1;

public class NabilBank extends CentralBank {

	@Override
	protected void getBankName() {
		System.out.println("Nabil Bank");
		
	}

	@Override
	protected void getInterestRate() {
		System.out.println("12%");
		
	}
	
	
}
