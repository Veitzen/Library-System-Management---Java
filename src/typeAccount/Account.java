package typeAccount;

import java.time.Instant;
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
		this.dateRegistration = Date.from(Instant.now());
	}
	
	//Getters and Setters
	
	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public static int getIdUser() {
		return idUser;
	}

	public static void setIdUser(int idUser) {
		Account.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAdress() {
		return mailAdress;
	}

	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

	public Date getDateRegistration() {
		return dateRegistration;
	}

	public void setDateRegistration(Date dateRegistration) {
		this.dateRegistration = dateRegistration;
	}
	
	// Features
	
	public boolean connect(String password){
		if(this.password.equals(password)) {
			return true;
		}
		return false;
	}
}
