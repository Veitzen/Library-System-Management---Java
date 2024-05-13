package resources;

import java.util.Date;

public class Book extends Resource {

	private String publisher;
	private String genre;
	private String language;
	private String ISBN;
	
	private String summary;
	
	public Book(String title, String author, Date publishDate, String condition) {
		super(title, author, publishDate, condition);
		// TODO Auto-generated constructor stub
	}
}
