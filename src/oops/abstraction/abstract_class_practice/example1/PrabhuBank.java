package oops.abstraction.abstract_class_practice.example1;

public class PrabhuBank extends CentralBank{

	@Override
	protected void getBankName() {
		System.out.println("Prabhu Bank");
	}

	@Override
	protected void getInterestRate() {
		System.out.println("8%");
	}
	
	
}
