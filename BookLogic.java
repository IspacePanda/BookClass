package by.epam.tr.bookclass;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

	public List<Book> listByAuthor(Library library, String author) {

		List<Book> result = new ArrayList<Book>();

		for (Book book : library.getBooks()) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				result.add(book);
			}
		}

		return result;
	}

	public List<Book> listByAuthor(List<Book> books, String author) {

		List<Book> result = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				result.add(book);
			}
		}
		return result;
	}

	public List<Book> listByPublishingHouse(Library library, String publishingHouse) {

		List<Book> result = new ArrayList<Book>();

		for (Book book : library.getBooks()) {
			if (book.getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
				result.add(book);
			}
		}

		return result;
	}

	public List<Book> listBypublishedDate(Library library, int publishedDate) {

		List<Book> result = new ArrayList<Book>();

		for (Book book : library.getBooks()) {
			if (book.getpublishedDate() >= publishedDate) {
				result.add(book);
			}
		}

		return result;
	}

}