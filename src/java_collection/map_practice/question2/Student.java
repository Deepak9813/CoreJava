/*
 
 		Q2> 			
 				Department - Student
		 		String 	   - List<Student>
 
 */


package java_collection.map_practice.question2;

public class Student {

	private int id;
	private String name;
	private String address;
	private String phoneNo;
	private static String university = "Far Western University";		//common share wala xa tesaile static lekheko[memory management]
	
	
	//default constructor
	public Student() {
		
	}

	//parameterized constructor
	public Student(int id, String name, String address, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	//getter and setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public static String getUniversity() {
		return university;
	}

	public static void setUniversity(String university) {
		Student.university = university;
	}

	//toString() method
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
}
