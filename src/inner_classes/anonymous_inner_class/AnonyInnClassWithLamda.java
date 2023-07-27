package inner_classes.anonymous_inner_class;

//FunctionalInterface
interface Test2 {

	void print();
}

public class AnonyInnClassWithLamda {

	public static void main(String[] args) {

		//using lamda(->)
		
		Test2 t2 = () -> {
			System.out.println("Printing from lamda....");
			System.out.println("Anonymous class with lamda");
		};
		
		t2.print();
		
		/*
		 
		 ==== 1 matra line(statement) vaye bracket nalekha ni hunxa but multiple vaye lekhnai parxa===
		
		 Test t2 = () -> System.out.println("Printing from lamda....");
		 t2.print();
		 
		  
		 */
	}
}