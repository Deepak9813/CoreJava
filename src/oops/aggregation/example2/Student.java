package oops.aggregation.example2;

public class Student {

	private int id;
	private String name;
	private int age;
	private String phoneNo;
	private String address;
	private String university;
	private String faculty; // faculty=> major [j lekhda ni hunxa ]

	private Bike bike; // IS-A relationship
	

	// getters and setters method
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
	

	//default constructor and parameterized constructor[optional].
	//We have setter method to set value, we can also set value using constructor[parameterized constructor]
	
	//default constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	//parameterized constructor
	public Student(int id, String name, int age, String phoneNo, String address, String university, String faculty,
			Bike bike) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.university = university;
		this.faculty = faculty;
		this.bike = bike;
	}
	
	

}
