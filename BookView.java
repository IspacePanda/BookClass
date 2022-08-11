package by.epam.tr.bookclass;
import java.util.List;

public class BookView {

	public void print(Library library) {

		for (Book book : library.getBooks()) {
			System.out.println(book);
		}
	}

	public void print(List<Book> books) {

		for (Book book : books) {
			System.out.println(book);
		}

		
	}

}