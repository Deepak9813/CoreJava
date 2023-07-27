//Q3> Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two object of class 'Student'.
//Q3Student,  Q3 ho vanera(serially milauna sajilo hola)  vanera lekheko


package oops.classses_and_objects;

public class Q3Student {

	// properties
	String name;
	int roll_no;
	String phone_no;
	String address;

	// print(display)
	void printStudentInfo() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + roll_no);
		System.out.println("Phone Number: " + phone_no);
		System.out.println("Address: " + address);
	}
}
