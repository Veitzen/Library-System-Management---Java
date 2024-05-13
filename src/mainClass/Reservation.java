package mainClass;

import java.util.Date;

import typeAccount.User;

public class Reservation {
	private User user;
	private StudyRoom room;
	private Date dateReservation;
	private double duration;
	
	public Reservation(User user, StudyRoom room, Date date, double duration) {
		this.user = user;
		this.room = room;
		dateReservation = date;
		this.duration = duration;
	}
}
