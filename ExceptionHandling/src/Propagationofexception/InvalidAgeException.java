package Propagationofexception;

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("Invalid age exception");

	}

	public InvalidAgeException(String str) {
		super(str);

	}
}

class NotIndianException extends RuntimeException {
	public NotIndianException(String str) {
		super(str);
	}
}
