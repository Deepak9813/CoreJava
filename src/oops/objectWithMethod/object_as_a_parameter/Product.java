package oops.objectWithMethod.object_as_a_parameter;

public class Product {

	private int id;
	private String name;
	private String company;
	private int price;

	// default constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Product(int id, String name, String company, int price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	// getters and setters methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
