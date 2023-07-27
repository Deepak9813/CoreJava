package oops.inheritance;

public class Test {
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		p.id = 3324;
		p.name = "Deepak";
		p.company = "Google";
		p.salary = 50000;
		p.bonus = 40000;
		p.progLang = "Java";
		p.project = "Earth";
		
		p.print();
	}

}
