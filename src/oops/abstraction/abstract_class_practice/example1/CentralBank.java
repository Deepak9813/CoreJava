package oops.abstraction.abstract_class_practice.example1;

public abstract class CentralBank {

	protected abstract void getBankName();

	protected abstract void getInterestRate() ;

	public void moneyExchageRate() {
		System.out.println("1$ = 132");
		System.out.println("Yen 10 = 10");
		System.out.println("Ic 100 = 160");
	}
}
