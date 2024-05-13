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
	private static int numberResource;
	private int id;
	private Date dateAddDB;
	private String placement;
	private boolean isBooked;
	private String condition;
	
	public Library getLibrary() {
		return library;
	}


	public void setLibrary(Library library) {
		this.library = library;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Date getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDateAddDB() {
		return dateAddDB;
	}


	public void setDateAddDB(Date dateAddDB) {
		this.dateAddDB = dateAddDB;
	}


	public String getPlacement() {
		return placement;
	}


	public void setPlacement(String placement) {
		this.placement = placement;
	}


	public boolean isBooked() {
		return isBooked;
	}


	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	// Constructor
	public Resource(String title, String author, Date publishDate, String condition) {
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		
		
		id = Resource.numberResource++;
		this.dateAddDB = Date.from(null);
		placement = "In Stock";
		isBooked = false;
		this.condition = condition;
	}
}
