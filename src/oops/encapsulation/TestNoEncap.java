package oops.encapsulation;

public class TestNoEncap {

	public static void main(String[] args) {

		CustomerNoEncap c = new CustomerNoEncap();
		c.id = 3434;
		c.name = "Deepak";
		c.age = 25;
		c.city = "Ktm";

		System.out.println("Id = " + c.id);
		System.out.println("Name = " + c.name);
		System.out.println("Age = " + c.age);
		System.out.println("City = " + c.city);
	}

}
