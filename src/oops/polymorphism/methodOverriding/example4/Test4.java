package oops.polymorphism.methodOverriding.example4;

public class Test4 {
	
	public static void main(String[] args) {
		
		Human h = new Human();			//Human reference & object
		h.job();        				//Working Professional
		
		
		//up-casting
		Human h1 = new Teacher();		//Human reference but Teacher object
		h1.job(); 						//Teacher
		
//		Human h1 = new Engineer();		//Human reference but Engineer object
//		h1.job(); 						//Engineer
		
//		Human h1 = new Doctor();		//Human reference but Doctor object
//		h1.job(); 						//Doctor
		
		
		
		System.out.println("====================Individually call garda code reusabily hudaina, code long hunxa then performance slow hunxa=====================");
		Teacher t = new Teacher();
		t.job();		//Teacher
		
		Engineer e = new Engineer();
		e.job();		//Engineer
		
		Doctor d = new Doctor();
		d.job();		//Doctor
		
			
		
		//calling the method
		Test4 t4 = new Test4();
		t4.printHumanInfo(h1);
	}
	
	

	
	//method
	public void printHumanInfo(Human h1) {
		
		System.out.println("==========Method ma kasko data janxa tha hudaina[run -time ko bela tha hunxa(by looking up-casting)]==========");
		
		h1.job();
	}


}
