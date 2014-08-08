package interactors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entities.Book;
import entities.Library;

public class ManipulateLibraryItems {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addingABookToTheLibrary_increasesNumberOfBooks() {
		Library l = new Library();
		int currentBookCount = l.getNumberOfBooks();
		Book b = new Book();
		AddBookToLibrary abtl = new AddBookToLibrary(b);
		abtl.execute();
		assertEquals(++currentBookCount, l.getNumberOfBooks());
	}

}
