package oops.polymorphism.methodOverriding.example2;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		Teacher t = new Teacher();   //Teacher reference & object
		t.teach();                   //I teach Java
		
		
		//up-casting
		Person p = new Teacher();	//Person reference but teacher object
		p.teach(); 					//I teach Java
		
		System.out.println("====================================");

		Person p1 = new Person(); 	//Person reference & object
		p1.teach();					//I can teach
		
	}

}
