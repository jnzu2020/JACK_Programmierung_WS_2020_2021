

public class Book {
	
	private String ISBN;
	private String title;
	private String author;
	private String publisher;
	private int yearPublished;
	private double cost;
	
	public Book(String ISBN, String title, String author, String publisher, int yearPublished, double cost) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.cost = cost;
	}
	
	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}

	public double getCost() {
		return cost;
	}
}
