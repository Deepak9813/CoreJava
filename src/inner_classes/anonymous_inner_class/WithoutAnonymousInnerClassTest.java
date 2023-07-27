package inner_classes.anonymous_inner_class;

//functional interface
interface Test {

	void print();
}

class TestImpl implements Test {

	@Override
	public void print() {

		System.out.println("Printing from implementation class....");

	}

}

public class WithoutAnonymousInnerClassTest {
	
	public static void main(String[] args) {
		
		//using implementation class
		//up-casting
		Test t = new TestImpl();
		t.print();
	}

}
