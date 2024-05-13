package typeAccount;

import java.util.ArrayList;
import java.util.List;

import mainClass.*;

public class User extends Account {
	private List<Fine> fineList;
	private List<Borrow> borrowList;
	private List<Reservation> reservationList;
	
	// Constructor
	public User(String username, String password, String name, String mailAdress) {
		super(username, password, name, mailAdress);
		fineList = new ArrayList<Fine>();
		borrowList = new ArrayList<Borrow>();
		reservationList = new ArrayList<Reservation>();
	}
	
	// Methods - Features
	
}
