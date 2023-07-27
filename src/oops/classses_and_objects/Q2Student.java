//Q2> Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as 2 and that of name as "john" by creating an object of the class Student.
//Q2Student,  Q2 ho vanera(serially milauna sajilo hola)  vanera lekheko

package oops.classses_and_objects;

public class Q2Student {
	// properties
	String name;
	int roll_no;

	// methods
	void diplayDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + roll_no);
	}
}
