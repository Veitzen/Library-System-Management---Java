package mainClass;

import java.util.Date;

public class Fine {
	private Library library;
	
	private double amount;
	private boolean isPaid;
	private Date dateFineCreated;
	private Date dateFinePaid;
	
	// Constructor
	public Fine(double amount) {
		this.amount = amount;
		dateFineCreated = Date.from(null);
	}
	
	// Getters and Setters
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Date getDateFineCreated() {
		return dateFineCreated;
	}

	public void setDateFineCreated(Date dateFineCreated) {
		this.dateFineCreated = dateFineCreated;
	}

	public Date getDateFinePaid() {
		return dateFinePaid;
	}

	public void setDateFinePaid(Date dateFinePaid) {
		this.dateFinePaid = dateFinePaid;
	}
}
