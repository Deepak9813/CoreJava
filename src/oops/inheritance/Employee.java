//==============================With Same method name[eg: print() ========================================
//Here in this program the parent class[Employee] & child Class[Programmer] have same method name[ie. print()] in this case, we use super.print(); method inside child class method to call parent class method. 

package oops.inheritance;

public class Employee {

	int id;
	String name;
	int salary;
	String city;
	String company;

	void print() {

		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
		System.out.println("City = "+city);
		System.out.println("Company = " + company);
	}

}
