package fixtures;

import entities.Book;
import entities.Library;

public class GivenBooks {

	private String title;
	private String author;

	public void setTitle(String title){
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void execute(){
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		Library library = new Library();
		library.addBook(book);
		System.out.println("Book saved");
	}
}
