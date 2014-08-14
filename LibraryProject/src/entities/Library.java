package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private static List<Book> books;
	
	public Library(){
		if(null == books){
			books = new ArrayList<Book>();
		}
	}

	public int getNumberOfBooks() {
		return books.size();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(int bookId) {
		Book bookToRemove = null;
		for(Book b : books)
			if(bookId == b.getId())
				bookToRemove = b;
		books.remove(bookToRemove);
	}
	
	public void clearBooks(){
		books = null;
	}
	
	public List<Book> getBooks(){
		return books;
	}

}
