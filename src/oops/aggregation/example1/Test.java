package oops.aggregation.example1;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setColor("Blue");
		c.setCompanyName("Tesla");
		c.setPrice(600000000);
		c.setModel("TXF500");
		
		
		Employee emp = new Employee();		
		emp.setId(3454);
		emp.setName("Deepak Baij");
		emp.setSalary(400000);
		emp.setOffice("Google");
		emp.setCar(c);
		
		
		//display
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Salary = "+emp.getSalary());
		System.out.println("=============Car Info=============");
		System.out.println("Model = "+emp.getCar().getModel());
		System.out.println("Price = "+emp.getCar().getPrice());
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Company Name = "+emp.getCar().getCompanyName());
	}

}
