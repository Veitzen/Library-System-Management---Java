package mainClass;

import java.util.ArrayList;
import java.util.List;

public class StudyRoom {
	private Library library;
	
	private static int idRoom;
	private int capacity;
	private boolean isAvailable;
	private List<Reservation> occupationList;
	
	public StudyRoom(int capacity) {
		idRoom = idRoom++;
		this.capacity = capacity;
		occupationList = new ArrayList<Reservation>();
		isAvailable = true;
	}
	
	// Getters and setters
	public static int getIdRoom() {
		return idRoom;
	}

	public static void setIdRoom(int idRoom) {
		StudyRoom.idRoom = idRoom;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public List<Reservation> getOccupationList() {
		return occupationList;
	}

	public void setOccupationList(List<Reservation> occupationList) {
		this.occupationList = occupationList;
	}
	// Methods
	
	public void clearOccupationList() {
		occupationList = new ArrayList<Reservation>();
	}

}
