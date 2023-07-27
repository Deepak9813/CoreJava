package oops.abstraction.interface_practice.example4;

public class StudentDetailsImpl implements StudentDetails{

	@Override
	public void showDetail(String name, int id, String address) {
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Address = "+address);
	}

}
