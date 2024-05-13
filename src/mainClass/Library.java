package mainClass;

import java.util.ArrayList;
import java.util.List;

import resources.Resource;
import typeAccount.Account;

public class Library {
	private String name;
	private List<Account> accountList;
	private List<Resource> resourceList;
	private List<StudyRoom> roomList;
	
	public Library(String name) {
		this.name = name;
		accountList = new ArrayList<Account>();
		resourceList = new ArrayList<Resource>();
		roomList = new ArrayList<StudyRoom>();
	}
}
