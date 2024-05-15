package mainClass;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import exceptions.AccountNotFoundExcepetion;
import resources.Resource;
import typeAccount.Account;
import typeAccount.User;

public class Library {
	
	// Attributes
	private String name;
	private List<Account> accountList;
	private List<Resource> resourceList;
	private List<StudyRoom> roomList;
	
	// PropertyChangeSupport for Controller
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	
	public PropertyChangeSupport getPcs() {
		return pcs;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
    
    // Getters and Setters
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	public List<Resource> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}

	public List<StudyRoom> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<StudyRoom> roomList) {
		this.roomList = roomList;
	}
	
    // Constructor
	public Library(String name) {
		this.name = name;
		accountList = new ArrayList<Account>();
		resourceList = new ArrayList<Resource>();
		roomList = new ArrayList<StudyRoom>();
		
		// Test
		this.accountList.add(new User("user", "password", "nameUser", "mail@example.com"));
	}
	
	// Methods
	
	public Account getUserbyUsername(String username) throws Exception {
		for(Account account : accountList) {
			if(account.getUsername().equals(username)) {
				return account;
			}
		}
		throw new AccountNotFoundExcepetion();
	}

}
