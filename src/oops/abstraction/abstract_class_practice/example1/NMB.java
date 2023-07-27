package oops.abstraction.abstract_class_practice.example1;

public class NMB extends CentralBank{

	@Override
	protected void getBankName() {
		System.out.println("NMB Bank");
		
	}

	@Override
	protected void getInterestRate() {
		System.out.println("14%");
		
	}
	
}
