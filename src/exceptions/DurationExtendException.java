package exceptions;

public class DurationExtendException extends Exception {
	public DurationExtendException() {
		super("The borrow cannot be extend for the given duration.");
	}
}
