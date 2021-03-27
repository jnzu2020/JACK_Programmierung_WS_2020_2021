import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduceFilter {
	private List<Book> books;
	
	public void setList(List<Book> books) {
		this.books = books;
	}
	
	public List<Book> getList() {
		return books;
	}
	
	//Aufgabe 1
	public String[] getISBNs() {
		List<String> isbnList = new ArrayList<>();
		books.forEach(book -> isbnList.add(book.getISBN()));
		return isbnList.toArray(new String[0]);
	}
	
	//Aufgabe 2
	public List<Book> filterByISBN(String ISBN) {
		return books.stream().filter(book -> ISBN.equals(book.getISBN())).collect(Collectors.toList());
	}
	
	public List<Book> filterByTitle(String title) {
		return books.stream().filter(book -> title.equals(book.getTitle())).collect(Collectors.toList());
	}
	
	public List<Book> filterByTerm(String term) {
		return books.stream().filter(book -> book.getTitle().toLowerCase().
						contains(term.toLowerCase()) || book.getAuthor().toLowerCase().
						contains(term.toLowerCase())).collect(Collectors.toList());
	}
	
	public List<Book> getRelevantBooks(String term, int year) {
		List<Book> filterdBooks = filterByTerm(term);
		return filterdBooks.stream().filter(book -> book.getYearPublished() >= year).
				collect(Collectors.toList());
	}
	
	//Aufgabe 3
	public List<Book> sortByTitle() {
		return books.stream().sorted(Comparator.comparing(Book::getTitle)).collect(Collectors.toList());
	}
	
	public List<Book> sortByCost(boolean ascending) {
		if (ascending) {
			return books.stream().sorted(Comparator.comparing(Book::getCost)).collect(Collectors.toList());
		} else {
			return books.stream().sorted(Comparator.comparing(Book::getCost).reversed()).
					collect(Collectors.toList());
		}
	}
	
	//Aufgabe 4
	public double getAverageCost() {
		return books.stream().mapToDouble(Book::getCost).average().getAsDouble();
	}
	
	public double getCollectiveCost() {
		return books.stream().mapToDouble(Book::getCost).sum();
	}
	
	public String getAllTitles() {
		return books.stream().map(Book::getTitle).
				reduce("", (book1, book2) -> book1 + "---" + book2);
	}
	
	public static void main(String[] args) {
		MapReduceFilter mrf = new MapReduceFilter();
		mrf.books = new ArrayList<>();
		
		Book b1 = new Book("978-0-141-03613-7", "Animal Farm", "George Orwell", "Penguin Books", 1951, 9.99);
		Book b2 = new Book("978-0-141-03614-4", "1984", "George Orwell", "Penguin Books", 1954, 14.99);
		Book b3 = new Book("978-0-241-14539-5", "How the World Works", "Noam Chomsky", "Hamish Hamilton", 2010, 17.99);
		Book b4 = new Book("978-0-439-36213-9", "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Pottermore Publishing", 2001, 12.99);
		Book b5 = new Book("0-261-10325-3", "The Lord of the Rings", "J.R.R. Tolkien", "HarperCollinsPublishers", 1995, 15.99);
		Book b6 = new Book("1-373-21437-5", "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 2012, 19.99);
		
		mrf.books.add(b1);
		mrf.books.add(b2);
		mrf.books.add(b3);
		mrf.books.add(b4);
		mrf.books.add(b5);
		mrf.books.add(b6);
		
		System.out.println("Aufgabe 1:");
		for(String s : mrf.getISBNs()) {
			System.out.println(s);
		}
		
		System.out.println("\nAufgabe 2:");
		System.out.println("Filtern nach ISBN '978-0-141-03614-4':");
		for(Book b : mrf.filterByISBN("978-0-141-03614-4")) {
			System.out.println(b.getTitle() + ": " + b.getISBN());
		}
		
		System.out.println("\nFiltern nach Titel 'The Lord of the Rings':");
		for(Book b : mrf.filterByTitle("The Lord of the Rings")) {
			System.out.println(b.getTitle() + ": " + b.getISBN());
		}
		
		System.out.println("\nFiltern nach Begriff 'george orwell':");
		for(Book b : mrf.filterByTerm("george orwell")) {
			System.out.println(b.getAuthor() + ", " + b.getTitle() + ": " + b.getISBN());
		}
		
		System.out.println("\nFiltern nach Begriff 'tolkien' ab dem Jahr 2000:");
		for(Book b : mrf.getRelevantBooks("tolkien", 2000)) {
			System.out.println(b.getAuthor() + ", " + b.getTitle() + ", " + b.getYearPublished() + ": " + b.getISBN());
		}
		
		System.out.println("\nAufgabe 3:");
		System.out.println("Sortieren nach Titel:");
		for(Book b : mrf.sortByTitle()) {
			System.out.println(b.getTitle() + ": " + b.getISBN());
		}
		
		System.out.println("\nSortieren nach Preis, absteigend:");
		for(Book b : mrf.sortByCost(false)) {
			System.out.println(b.getTitle() + ", " + b.getCost() + ": " + b.getISBN());
		}
		
		System.out.println("\nAufgabe 3:");
		System.out.println("Durchschnittlicher Preis: " + mrf.getAverageCost());
		
		System.out.println("\nSumme aller Preise: " + mrf.getCollectiveCost());
		
		System.out.println("\nListe aller Titel: " + mrf.getAllTitles());
	}
}
