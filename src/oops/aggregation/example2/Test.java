package oops.aggregation.example2;

public class Test {

	public static void main(String[] args) {

		Bike bike = new Bike();

		bike.setBrand("Honda");
		bike.setModel("CB Hornet 160R");
		bike.setColor("Yellow and Black combination");
		bike.setPower("14.9 bhp@ 8500 rpm");
		bike.setFuelTank(12);
		bike.setCc(163);
		bike.setMileage(50);
		bike.setTotalGears(5);
		bike.setPrice(349900);

		Student std = new Student();
		std.setId(101);
		std.setName("Deepak Baij");
		std.setAge(25);
		std.setPhoneNo("9813485412");
		std.setAddress("kanchanpur, Nepal");
		std.setUniversity("Far Western University");
		std.setFaculty("CSIT");
		std.setBike(bike); // pass bike object

		// display
		System.out.println("Id = " + std.getId());
		System.out.println("Name = " + std.getName());
		System.out.println("Age = " + std.getAge());
		System.out.println("Phone Number = " + std.getPhoneNo());
		System.out.println("Address = " + std.getAddress());
		System.out.println("University = " + std.getUniversity());
		System.out.println("Faculty = " + std.getFaculty());
		System.out.println("=============Bike Info============");
		System.out.println("Brand = " + std.getBike().getBrand());
		System.out.println("Model = " + std.getBike().getModel());
		System.out.println("Color = " + std.getBike().getColor());
		System.out.println("Power = " + std.getBike().getPower());
		System.out.println("Fuel Tank = " + std.getBike().getFuelTank() + " Ltr.");
		System.out.println("CC = " + std.getBike().getCc() + " cc");
		System.out.println("Mileage = " + std.getBike().getMileage() + " kmpl");
		System.out.println("Total Gears = " + std.getBike().getTotalGears());
		System.out.println("Price = " + std.getBike().getPrice());

	}
}
