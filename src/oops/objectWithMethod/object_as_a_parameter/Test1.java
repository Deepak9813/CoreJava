package oops.objectWithMethod.object_as_a_parameter;

public class Test1 {

	public static void main(String[] args) {
		
		Student1 s = new Student1();
		s.setId(1);
		s.setName("Deepak");
		s.setAge(25);
		s.setAddress("Kathmandu");
		s.setPhoneNo("9813485412");
		
		
		//method call garnu paryo[jun class ma method xa tesko object le call garne]
		Test1 t = new Test1();
		t.printStudent(s);
		
	}
	
	
	
	void printStudent(Student1 s) {
		System.out.println("Id = "+s.getId());
		System.out.println("Name = "+s.getName());
		System.out.println("Age = "+s.getAge());
		System.out.println("Address = "+s.getAddress());
		System.out.println("Phone Number = "+s.getPhoneNo());
	}
	
}
