//What is the output of this program? Make your Mind as JVM, first think output then run the program to check your output match or not

package oops.static_keyword;

public class CounterWithoutStatic {
	
	int count = 0; 	//will get memory when instance(object) is created
	
	
	 CounterWithoutStatic() {
		 
		 count++;
		
	}
	 
	 private void showCount() {
		 System.out.println(count);
	 }

	public static void main(String[] args) {
		new CounterWithoutStatic().showCount();
		new CounterWithoutStatic().showCount();
		new CounterWithoutStatic().showCount();
	} 
	 
}


/*
    =========================NOTES=========================
    1) ek(1) matra method call garnu xa, tesaile direct gareko. //object ta create vako ho teta ni.
    
    
    			====yesto garda ni hunxa====
  
    CounterWithoutStatic s1 = new CounterWithoutStatic();
    s1.showCount();
    
    CounterWithoutStatic s2 = new CounterWithoutStatic();
    s2.showCount();
    
    CounterWithoutStatic s3 = new CounterWithoutStatic();
    s3.showCount();
    
    
    
    
*/    
