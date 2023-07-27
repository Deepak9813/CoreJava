package oops.abstraction.interface_practice.example1;

public class UserServiceImpl implements UserService{

	@Override
	public void addUser() {
		System.out.println("Added Successfully");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("Deleted Successfully");
		
	}

	

}
