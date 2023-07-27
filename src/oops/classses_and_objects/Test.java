package oops.classses_and_objects;

public class Test {

	 public static void main(String[] args) {
		//represent math book
		 Books b = new Books();
		 b.id = 2323;
		 b.name = "Math";
		 b.author ="R.C";
		 b.price = 4000;
		 
		 b.printBookInfo();
		 
		 
		 System.out.println("=====================");
		 //Represent Computer Books
		 Books b1 = new Books();
		 b1.id = 1234;
		 b1.name = "Computer";
		 b1.author = "Xyz";
		 b1.price = 3000;
		 
		 b1.printBookInfo();
	}
}
