//=====static method can access static data member & can change the value of it=====

package oops.static_keyword;

public class ChangeStaticValue {

	int rollno;
	String name;
	static String college = "TRICHANDRA";

	
	// static method
	static void change() {
		college = "ASCOL";
	}

	
	ChangeStaticValue(int r, String n) {
		
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + "  " + name + "  " + college);
	
	}
	
	
	public static void main(String[] args) {
		ChangeStaticValue s1 = new ChangeStaticValue(111, "Deepak");
		s1.display();
		
		ChangeStaticValue.change();
		
		ChangeStaticValue s2 = new ChangeStaticValue(222, "Ram");
		ChangeStaticValue s3 = new ChangeStaticValue(333, "Chirayu");
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}
}
