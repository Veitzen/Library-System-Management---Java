package mainClass;

import java.time.Duration;
import java.util.Date;

import exceptions.DurationExtendException;
import exceptions.ENExtendException;
import resources.Resource;
import typeAccount.User;

public class Borrow {
	private User user;
	private Resource resource;
	private Date dateReservation;
	private Duration duration;
	private int numExtendReturn;
	private Duration extendDuration;
	
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
		if(this.numExtendReturn > 2) {
			throw new ENExtendException();
		}
		if(this.extendDuration.plus(extendTime).compareTo(Duration.ofDays(62)) > 0) {
			throw new DurationExtendException();
		}
		this.duration = this.duration.plus(extendTime);
		numExtendReturn++;
		extendDuration.plus(extendTime);
	}
	
}
