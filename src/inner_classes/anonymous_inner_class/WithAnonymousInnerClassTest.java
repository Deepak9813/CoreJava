package inner_classes.anonymous_inner_class;


//functional interface
interface Test1{
	
	void print();
}


public class WithAnonymousInnerClassTest {
	
	public static void main(String[] args) {
		
		//using anonymous class[implementation class banaunu pardaina yesma]
		Test1 t1 = new Test1() {

			@Override
			public void print() {
				
				System.out.println("Printing from anonymous class......");
				
			}
		};
		t1.print();
		
	}

}
