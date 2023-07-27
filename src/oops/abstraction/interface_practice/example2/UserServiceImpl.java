package oops.abstraction.interface_practice.example2;

public class UserServiceImpl implements UserService{

	@Override
	public void print() {
		System.out.println("Printing............");
		
	}

	@Override
	public void addUser() {
		System.out.println("Added Successfully");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("Deleted Successfully");
		
	}

	

}
