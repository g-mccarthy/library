package interactors;

import entities.Book;
import entities.Library;

public class AddBookToLibrary {

	private Book book;

	public AddBookToLibrary(Book book) {
		this.book = book;
	}

	public void execute() {
		Library l = new Library();
		l.addBook(this.book);
		
	}

}
