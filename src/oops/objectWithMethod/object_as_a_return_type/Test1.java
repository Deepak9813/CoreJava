package oops.objectWithMethod.object_as_a_return_type;

public class Test1 {

	public static void main(String[] args) {

		Test1 t = new Test1();
		Student1 s = t.getStudentData();
		t.printStudent(s);

	}

	void printStudent(Student1 s) {
		System.out.println("Id = " + s.getId());
		System.out.println("Name = " + s.getName());
		System.out.println("Age = " + s.getAge());
		System.out.println("Address = " + s.getAddress());
		System.out.println("Phone Number = " + s.getPhoneNo());
	}

	Student1 getStudentData() {

		Student1 s = new Student1();
		s.setId(1);
		s.setName("Deepak");
		s.setAge(25);
		s.setAddress("Kathmandu");
		s.setPhoneNo("9813485412");

		return s;
	}

}
