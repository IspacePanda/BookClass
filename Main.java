package by.epam.tr.bookclass;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Library library = new Library();

		library.add(new Book(1, "Head First Java", "Kathy Sierra, Bert Bates", " O'Reilly Media, Inc", 2005, 340, 21,
				Binding.SOFT));
		library.add(
				new Book(2, "A Beginner's Guide", "Herbert Schildt", "McGraw-Hill", 2018, 200, 18, Binding.SOLID));
		library.add(new Book(3, "Spring in Action", "Craig Walls", "Manming", 2005, 472, 25, Binding.SOLID));
		library.add(new Book(4, "Clean Code", "Robert C. Martin", "Person", 2013, 464, 30, Binding.SOLID));
		library.add(new Book(5, "Test Driven", "Lasse Koskela", "Amazon.com", 2007, 340, 26, Binding.SOLID));
		library.add(new Book(6, "Thinking in Java", "Bruce Eckel", "Person", 2019, 1150, 6, Binding.SOFT));
		library.add(new Book(7, "97 Things Every Java Programmer Should Know", "Kevlin Henney", "O'Reilly Media", 2020,
				270, 109, Binding.SOFT));

		BookLogic logic = new BookLogic();

		List<Book> resultByAuthor = logic.listByAuthor(library, "Robert C. Martin");

		List<Book> resultByPublishingHouse = logic.listByPublishingHouse(library, "Person");

		List<Book> resultByPublishedDate = logic.listBypublishedDate(library, 2013);

		BookView view = new BookView();

		System.out.println("By author");
		view.print(resultByAuthor);

		System.out.println("By publishing house");
		view.print(resultByPublishingHouse);

		System.out.println("By published date");
		view.print(resultByPublishedDate);

	}

}