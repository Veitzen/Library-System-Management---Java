package resources;

import java.util.Date;

import mainClass.Library;

public class Resource {
	private Library library;
	
	// Basic informations about a resource
	private String title;
	private String author;
	private Date publishDate;
	
	// Information for the library
	private static int id;
	private Date dateAddDB;
	private String placement;
	private boolean isBooked;
	private String condition;
	
	public Resource(String title, String author, Date publishDate, String condition) {
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		
		Resource.id = id++;
		this.dateAddDB = Date.from(null);
		placement = "In Stock";
		isBooked = false;
		this.condition = condition;
	}
}
