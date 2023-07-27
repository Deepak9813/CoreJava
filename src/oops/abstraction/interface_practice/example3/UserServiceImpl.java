package oops.abstraction.interface_practice.example3;

public class UserServiceImpl implements CommonService{

	@Override
	public void addUser() {
		System.out.println("Added Successfully");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("Deleted Successfully");
		
	}

	@Override
	public void print() {
		System.out.println("Printing.......");
		
	}

	

	

}
