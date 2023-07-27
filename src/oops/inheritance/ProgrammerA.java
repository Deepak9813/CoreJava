package oops.inheritance;

public class ProgrammerA extends EmployeeA{
	
	String progLang;
	String project;
	int bonus;
	
	void print2() {
		//print1();     //yeta lekhda[call garda] ni hunxa
		System.out.println("Programming Language ="+progLang);
		System.out.println( "Project = "+project);
		System.out.println("Bonus = "+bonus);
	}
	

}
