package mainClass;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import resources.Resource;
import typeAccount.Account;

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
	
    // Constructor
	public Library(String name) {
		this.name = name;
		accountList = new ArrayList<Account>();
		resourceList = new ArrayList<Resource>();
		roomList = new ArrayList<StudyRoom>();
	}
}
