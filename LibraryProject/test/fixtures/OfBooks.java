package fixtures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Book;
import entities.Library;

public class OfBooks {

	private List<Object> list(Object... objects) {
	    return Arrays.asList(objects);
	  }
	
	public List<Object> query(){
		Library l = new Library();
		List<Book> books = new ArrayList<Book>();
		List<Object> queryResponse = new ArrayList<Object>();
		books = l.getBooks();
		for(Book b : books)
			queryResponse.add(makeRow(b));
		return queryResponse;
	}
	
	private List<Object> makeRow(Book b) {
	    return list(
	      new Object[]{list("title", b.getTitle()),
	        list("author", b.getAuthor())}
	    );
	  }
	
//	public List<Object> query() {
//	    User loggedInUser = Context.gateKeeper.getLoggedInUser();
//	    PresentCodecastUseCase useCase = new PresentCodecastUseCase();
//	    List<PresentableCodecast> presentableCodecasts = useCase.presentCodecasts(loggedInUser);
//	    List<Object> queryResponse = new ArrayList<Object>();
//	    for (PresentableCodecast pcc : presentableCodecasts)
//	      queryResponse.add(makeRow(pcc));
//	    return queryResponse;
//
//	  }
}
