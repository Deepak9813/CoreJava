package oops.encapsulation;

public class TestEncap {
	public static void main(String[] args) {
		
		CustomerEncap c = new CustomerEncap();
		c.setId(3434);
		c.setName("Deepak");
		c.setAge(25);
		c.setCity("ktm");
		
		
		
//		System.out.println("Id = " + c.getId());
//		System.out.println("Name = " + c.getName());
//		System.out.println("Age = " + c.getAge());
//		System.out.println("City = " + c.getCity());
		
		//printing in one line[ie. printing object in one line]. For this, we need to override toString() method in POJO class.
		System.out.println(c);   //c is object
	}

}
