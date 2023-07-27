package oops.objectWithMethod.object_as_a_return_type;

public class Test {

	public static void main(String[] args) {

		Test t = new Test();
		Product p = t.getProductData();
		t.printProduct(p);
		

	}

	void printProduct(Product p) {
		System.out.println("Id = " + p.getId());
		System.out.println("Name = " + p.getName());
		System.out.println("Company = " + p.getCompany());
		System.out.println("Price = "+p.getPrice());
	}

	// ===============Object as a return type=======================

	Product getProductData() {

		Product p = new Product();
		p.setId(343);
		p.setName("Mobile");
		p.setCompany("Samsung");
		p.setPrice(50000);

		return p;

	}
}
