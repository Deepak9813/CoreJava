package java_collection.list_practice.example2;

public class Book {

	private String name; // title lekhda ni hunxa
	private String author;
	private int publicationYear;
	private String publisher;
	private String language;
	private double price;

	// getters & setters methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// default constructor & parameterized constructor pani banauda hunxa[optional]
	// default constructor
	public Book() {

	}

	//parameterized  constructor
	public Book(String name, String author, int publicationYear, String publisher, String language, double price) {
		super();
		this.name = name;
		this.author = author;
		this.publicationYear = publicationYear;
		this.publisher = publisher;
		this.language = language;
		this.price = price;
	}

	//toString() method
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publicationYear=" + publicationYear + ", publisher="
				+ publisher + ", language=" + language + ", price=" + price + "]";
	}


}
