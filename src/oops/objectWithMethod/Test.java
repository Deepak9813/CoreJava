package oops.objectWithMethod;

public class Test {
	
	public static void main(String[] args) {
		
		
//		System.out.println("==============object as parameter========================");
//		
//		Product p1 = new Product();
//		p1.setId(11);
//		p1.setName("Laptop");
//		p1.setPrice(2000);
//		p1.setCompany("Dell");	
//		Test t = new Test();
//		t.printProduct(p1);
		
		
		System.out.println("==============object as return type========================");
		
		Test t = new Test();
		Product p = t.getProductData();
		t.printProduct(p);
	}
	
	
	//==============object as parameter========================
	void printProduct(Product p) {
		
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Company = "+p.getCompany());
	}
	
	//==============object as return type========================
	
	Product getProductData() {
		
		Product p1 = new Product();
		p1.setId(11);
		p1.setName("Laptop");
		p1.setPrice(2000);
		p1.setCompany("Dell");
		
		return p1;
		
		
	}
}
