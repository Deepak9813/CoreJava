/*
 
  Q1>
		 	BrandName - Products
		 	String - List<Products>
 
 */


package java_collection.map_practice.question1;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	
	//default constructor
	public Product() {
		
	}
	
	//parameterized constructor
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	//getters and setters methods
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//toString() method
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
	
	

}
