package java_collection.list_practice.example2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {

		Book b1 = new Book();

		b1.setName("Muna Madan");
		b1.setAuthor("Laxmi Prasad Devkota");
		b1.setPublicationYear(1936);
		b1.setPublisher("Sajha Prakashan");
		b1.setLanguage("Nepali");
		b1.setPrice(150);


		Book b2 = new Book();

		b2.setName("Valmiki Ramayana");
		b2.setAuthor("Bhanubhakta Acharya");
		b2.setPublicationYear(1887);
		b2.setPublisher("N/A");
		b2.setLanguage("Nepali");
		b2.setPrice(250);
		
		
		Book b3 = new Book();

		b3.setName("To Kill a Mockingbird");
		b3.setAuthor("Harper Lee");
		b3.setPublicationYear(1960);
		b3.setPublisher("J. B. Lippincott & Co.");
		b3.setLanguage("English");
		b3.setPrice(2599);
		
		
		
		 List<Book> book = new ArrayList<>();
		//List<Book> book = new LinkedList<>();

		// add
		book.add(b1);
		book.add(b2);
		book.add(b3);

		// forEach loop[to print details(all elements)]
		for (Book b : book) {
			System.out.println(b);
		}

		System.out.println("======forEach ko arko shortcut[lamda expression]======");
		book.forEach(b -> System.out.println(b));

	}

}
