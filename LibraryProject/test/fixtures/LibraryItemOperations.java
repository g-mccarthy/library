package fixtures;

import interactors.AddBookToLibrary;
import interactors.RemoveBookFromLibrary;
import entities.Book;
import entities.Library;

public class LibraryItemOperations {

	
	private Library myLibrary = new Library();

	public void WhenIRemoveABook(){
		int bookId = 123;
		RemoveBookFromLibrary rbfl = new RemoveBookFromLibrary(bookId);
		rbfl.execute();
	}
	
	public void WhenIAddABook(){
		Book book = new Book();
		AddBookToLibrary addBook = new AddBookToLibrary(book);
		addBook.execute();
	}
	
	public int theNumberOfBooksInTheLibraryIs(){
		
		return myLibrary.getNumberOfBooks();
		
	}
	
	public void resetLibrary(){
		myLibrary.clearBooks(); 
	}
}
