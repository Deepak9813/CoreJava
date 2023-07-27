package oops.polymorphism.methodOverriding;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding of object
		NabilBank nb = new NabilBank();
		nb.getBankName();
		nb.getInterestRate();
		//nb.moneyExchageRate();  //moneyExchangeRate(); sab ko lagi same ho tesaile direct call garne
		
		
		//up-casting
		CentralBank b = new  PrabhuBank();
		
		
	}
	
	//dynamic or late binding of object[run time ko bela tha hunxa]
	//run time polymorphism
	void printBankInfo(CentralBank b) {
		
		b.getBankName();
		b.getInterestRate();
	}

}
