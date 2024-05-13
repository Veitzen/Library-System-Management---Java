package exceptions;

public class ENExtendException extends Exception{
	
	public ENExtendException() {
		super("The user has exceeded the number of extend of the resource.");
	}
	public ENExtendException(String messsage) {
		super(messsage);
	}
}
