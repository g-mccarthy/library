package fixtures;

import interactors.AddBookToLibrary;
import entities.Book;
import entities.Library;

public class AddABook {

	
	public void GivenTheNumberOfBooksInTheLibraryIs(String numberOfBooks){
		Library library = new Library();
		
	}
	
	public void WhenIAddABook(){
		Book book = new Book();
		AddBookToLibrary addBook = new AddBookToLibrary(book);
		addBook.execute();
	}
	
	public int theNumberOfBooksInTheLibraryIs(){
		Library myLibrary = new Library();
		return myLibrary.getNumberOfBooks();
		
	}
}
