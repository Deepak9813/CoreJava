package oops.objectWithMethod.object_as_a_parameter;

public class Student1 {

	private int id;
	private String name;
	private int age;
	private String address;
	private String phoneNo;

	// default constructor
	public Student1() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Student1(int id, String name, int age, String address, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	// getters and setters methods
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

}
