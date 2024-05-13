package mainClass;

import java.beans.PropertyChangeEvent;
import java.time.Duration;
import java.util.Date;

import exceptions.DurationExtendException;
import exceptions.ENExtendException;
import resources.Resource;
import typeAccount.User;

public class Borrow {
	private Library library;
	
	private User user;
	private Resource resource;
	private Date dateReservation;
	private Duration duration;
	private int numExtendReturn;
	private Duration extendDuration;
	
	/**
	 * Maximal number of DAYS for a borrow.
	 */
	private final int MAX_DURATION_TIME = 60;
	/**
	 * Maximal number of extension for a borrow.
	 */
	private final int MAX_NUMBER_EXTENSION = 2;
	
	//Getters and Setters
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public int getNumExtendReturn() {
		return numExtendReturn;
	}
	public void setNumExtendReturn(int numExtendReturn) {
		this.numExtendReturn = numExtendReturn;
	}
	public Duration getExtendDuration() {
		return extendDuration;
	}
	public void setExtendDuration(Duration extendDuration) {
		this.extendDuration = extendDuration;
	}
	
	// Methods - Features
	public void extendDuration(Duration extendTime) throws Exception {
		if(this.numExtendReturn > MAX_NUMBER_EXTENSION) {
			throw new ENExtendException();
		}
		if(this.extendDuration.plus(extendTime).compareTo(Duration.ofDays(MAX_DURATION_TIME)) > 0) {
			throw new DurationExtendException();
		}
		this.duration = this.duration.plus(extendTime);
		numExtendReturn++;
		extendDuration.plus(extendTime);
		library.getPcs().firePropertyChange(new PropertyChangeEvent(this, "Borrow Time extension", duration.minus(extendTime), duration));
	}
	
}
