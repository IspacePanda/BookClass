package by.epam.tr.bookclass;

import java.util.Objects;

public class Book {

	private int id;
	private String titles;
	private String author;
	private String publishingHouse;
	private int publishedDate;
	private int numberOfPages;
	private int price;
	private Binding binding;

	public Book() {
		super();
	}

	public Book(int id, String titles, String author, String publishingHouse, int publishedDate, int numberOfPages,
			int price, Binding binding) {
		super();
		this.id = id;
		this.titles = titles;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.publishedDate = publishedDate;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.binding = binding;
	}

	public Book(int id, String title, String author, int numberOfPages, int price, Binding binding, String titles) {
		super();
		this.id = id;
		this.titles = titles;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.binding = binding;
	}

	public Book(int id, String titles, String author, String publishingHouse, int publishedDate, int numberOfPages,
			Binding binding) {
		super();
		this.id = id;
		this.titles = titles;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.publishedDate = publishedDate;
		this.numberOfPages = numberOfPages;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitles() {
		return titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getpublishedDate() {
		return publishedDate;
	}

	public void setpublishedDate(int publishedDate) {
		this.publishedDate = publishedDate;
	}

	public int getnumberOfPages() {
		return numberOfPages;
	}

	public void setnumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, binding, numberOfPages, id, price, publishedDate, publishingHouse, titles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && binding == other.binding && numberOfPages == other.numberOfPages
				&& id == other.id && price == other.price && publishedDate == other.publishedDate
				&& Objects.equals(publishingHouse, other.publishingHouse) && Objects.equals(titles, other.titles);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", titles=" + titles + ", author=" + author
				+ ", publishingHouse=" + publishingHouse + ", publishedDate=" + publishedDate + ", numberOfPages="
				+ numberOfPages + ", price=" + price + ", binding=" + binding + "]";
	}

}