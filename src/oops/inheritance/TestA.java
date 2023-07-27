package oops.inheritance;

public class TestA {
	public static void main(String[] args) {
		
		ProgrammerA p = new ProgrammerA();
		p.id = 3324;
		p.name = "Deepak";
		p.city = "Ktm";
		p.company = "Google";
		p.salary = 50000;
		p.bonus = 40000;
		p.progLang = "Java";
		p.project = "Earth";
		
		p.print1();		//yeta lekha[call garda] ni hunxa
		p.print2();
	}

}
