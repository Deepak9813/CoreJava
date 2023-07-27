package oops.aggregation.example2;

public class Bike {
	
	private String brand;
	private String model;
	private String color;
	private String power;
	private double fuelTank;
	private int cc;				//cc=>cubic capacity
	private int mileage;
	private int totalGears;
	private double price;
	
	
	//getters and setters method
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public double getFuelTank() {
		return fuelTank;
	}
	public void setFuelTank(double fuelTank) {
		this.fuelTank = fuelTank;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getTotalGears() {
		return totalGears;
	}
	public void setTotalGears(int totalGears) {
		this.totalGears = totalGears;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//default constructor and parameterized constructor[optional].
	//We have setter method to set value, we can also set value using constructor[parameterized constructor]
	
	//default constructor
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Bike(String brand, String model, String color, String power, double fuelTank, int cc, int mileage,
			int totalGears, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.power = power;
		this.fuelTank = fuelTank;
		this.cc = cc;
		this.mileage = mileage;
		this.totalGears = totalGears;
		this.price = price;
	}
	
	
	

}
