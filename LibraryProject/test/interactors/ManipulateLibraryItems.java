package interactors;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Book;
import entities.Library;

public class ManipulateLibraryItems {

	private Library l;

	@Before
	public void setUp() throws Exception {
		l = new Library();
	}
	
	@After
	public void tearDown() throws Exception{
		l = null;
	}

	@Test
	public void addingABookToTheLibrary_increasesNumberOfBooksByOne() {
		int currentBookCount = l.getNumberOfBooks();
		Book b = new Book();
		AddBookToLibrary abtl = new AddBookToLibrary(b);
		abtl.execute();
		assertEquals(++currentBookCount, l.getNumberOfBooks());
	}
	
	@Test
	public void removingABook_reducesTheNumberOfBooksByOne(){
		int currentBookCount = l.getNumberOfBooks();
		Book b = new Book();
//		Book b2 = new Book(124);
		AddBookToLibrary abtl = new AddBookToLibrary(b);
		abtl.execute();
//		++currentBookCount;
//		abtl = new AddBookToLibrary(b2);
//		abtl.execute();
		assertEquals(++currentBookCount, l.getNumberOfBooks());
		RemoveBookFromLibrary rbfl = new RemoveBookFromLibrary(b.getId());
		rbfl.execute();
		assertEquals(--currentBookCount, l.getNumberOfBooks());
	}

}
