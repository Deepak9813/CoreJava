//=====================With Encapsulation================================

package oops.encapsulation;

public class CustomerEncap {

	// POJO or model or Entity class [POJO==> Plain Old Java Object]

	private int id;
	private String name;
	private int age;
	private String city;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// toString() method
	@Override
	public String toString() {
		return "CustomerEncap [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
