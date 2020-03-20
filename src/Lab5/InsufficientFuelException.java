package Lab5;

public class InsufficientFuelException extends IllegalStateException{
	
	public InsufficientFuelException(){}
	
	public InsufficientFuelException(String message) {
		super(message);
	}

}