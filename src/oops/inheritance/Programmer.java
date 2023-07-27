package oops.inheritance;

public class Programmer extends Employee{
	
	String progLang;
	String project;
	int bonus;
	
	void print() {
		super.print();     //parent class ko method call gareko[ same method hunale gareko natra direct print(); garda hunthyo]
		System.out.println("Programming Language ="+progLang);
		System.out.println( "Project = "+project);
		System.out.println("Bonus = "+bonus);
	}
	

}
