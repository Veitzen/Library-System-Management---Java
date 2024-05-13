package typeAccount;

import java.util.Date;

import mainClass.Library;

public class Account {
	private Library library;
	
	private static int idUser;
	private String username;
	private String password;
	private String name;
	private String mailAdress;
	private Date dateRegistration;
	
	public Account(String username, String password, String name, String mailAdress) {
		idUser = idUser++;
		this.username = username;
		this.password = password;
		this.name = name;
		this.mailAdress = mailAdress;
		this.dateRegistration = Date.from(null);
	}
	
	public boolean connect(String password){
		if(this.password != password) {
			return false;
		}
		return true;
	}
}
