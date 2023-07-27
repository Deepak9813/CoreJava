package oops.classses_and_objects;

public class Q3Test {
	public static void main(String[] args) {
		
		//printing Sam details
		Q3Student s = new Q3Student();
		s.name = "Sam";
		s.roll_no = 01;
		s.phone_no = "9848977856";
		s.address = "Kathmandu";
		
		s.printStudentInfo();
		
		System.out.println("-------------------------------------------");
		
		//printing John Details
		Q3Student s1 = new Q3Student();
		s1.name ="John";
		s1.roll_no = 02;
		s1.phone_no = "9813485412";
		s1.address = "Lalitpur";
		
		s1.printStudentInfo();
	}

}
