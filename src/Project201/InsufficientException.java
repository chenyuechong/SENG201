package Project201;

public class InsufficientException extends IllegalStateException{
	public InsufficientException(){}
	public InsufficientException(String message) {
		super(message);
	}
}
