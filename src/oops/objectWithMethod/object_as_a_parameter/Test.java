package oops.objectWithMethod.object_as_a_parameter;

public class Test {

	public static void main(String[] args) {
		
		Product p = new Product();
		p.setId(343);
		p.setName("Mobile");
		p.setCompany("Samsung");
		p.setPrice(50000);
		
		Test t = new Test();
		t.printProduct(p);
		
	}
	
	//===============Object as a parameter==================
	
	void printProduct(Product p) {
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Company = "+p.getCompany());
		System.out.println("Price = "+p.getPrice());
	}
}
