package interactors;

import entities.Library;

public class RemoveBookFromLibrary {

	private int id;

	public RemoveBookFromLibrary(int bookId) {
		this.id = bookId;
	}

	public void execute() {
		Library l = new Library();
		l.removeBook(id);
	}
}
