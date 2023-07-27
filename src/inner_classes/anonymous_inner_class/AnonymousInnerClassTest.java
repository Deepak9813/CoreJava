/*
 
 ====================Anonymous Inner Class=====================
		
		▮ A inner class that does not have any name is known as anonymous class.
	
			Note[in Nepali]: 
			  -> Nam navayeko class  lai anonymous class vaninxa.
			  
 
 Example:
 	1> using implementation class[Normal way]
 	2> using anonymous class
 	3> using lamda(->)
 	
 */

package inner_classes.anonymous_inner_class;

//functional interface
interface TestA {
	void print();
}

class TestImplA implements TestA {

	@Override
	public void print() {
		System.out.println("printing from impl. class.....");

	}

}

public class AnonymousInnerClassTest {
	
	public static void main(String[] args) {

		// using implementation class
		// up-casting
//		TestA t = new TestImpl();
//		t.print();
//		
//		System.out.println("=========================");
//		
		// using anonymous class
		// TestImpl class nabanayera ni hunxa
//		TestA t1 = new TestA() {
//
//			@Override
//			public void print() {
//				System.out.println("From anonymous class");
//				
//			}
//			
//		};
//		t1.print();
//		
		System.out.println("=========================");

		// using lamda ( -> )

//		TestA t2 = () ->{
//			System.out.println("From anonymous class with lamda.....");
//			System.out.println("lamda....");
//			
//		};
//		t2.print();

		// 1 matra line(statement) xa vanye bracket lagaunu pardaina
		TestA t2 = () -> System.out.println("From lamda");

		t2.print();

	}
}