//Note: Q3=> Question 3 ho vanera chinna lekhyeko

package oops.inheritance.inheritance_practice;

public class Q3Test {
	
	public static void main(String[] args) {
		
		//creating object of both Employee & Manager class
		Q3Employee e = new Q3Employee();
		Q3Manager m = new Q3Manager();
		
		//assign name, age, phone number, address and salary to an employee and a manager
		 e.name = "Deepak";
		 e.age = 25;
		 e.phoneNo = "9813485412";
		 e.address = "Lalitpur";
		 e.salary = 50000;
		 e.specialization = "Website Designing";
		 
		 m.name = "Dipu";
		 m.age = 30;
		 m.phoneNo = "9813485412";
		 m.address = "kathmandu";
		 m.salary = 90000;
		 m.department = "IT Department";
		 
		 //printing details
		 System.out.println("==================Employee Info==================");
		 System.out.println("Name = "+e.name);
		 System.out.println("Age = "+e.age);
		 System.out.println("Phone Number = "+e.phoneNo);
		 System.out.println("Address = "+e.address);
		 e.printSalary(); //method xa so direct call garda hunxa
		//System.out.println("Salary = "+e.salary);  //yesto garna  ni pauxa pauna ta but method xa direct call garda vaihalyo
		System.out.println("Specialization = "+e.specialization);
	
	
		 System.out.println("==================Manager Info==================");
		 System.out.println("Name = "+m.name);
		 System.out.println("Age = "+m.age);
		 System.out.println("Phone Number = "+m.phoneNo);
		 System.out.println("Address = "+m.address);
		 m.printSalary(); //method xa so direct call garda hunxa
		//System.out.println("Salary = "+m.salary);  //yesto garna  ni pauxa pauna ta but method xa direct call garda vaihalyo
		System.out.println("Department = "+m.department);

	
	
	}

}
