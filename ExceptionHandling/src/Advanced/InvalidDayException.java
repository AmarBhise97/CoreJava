package Advanced;

public class InvalidDayException extends RuntimeException {
	public InvalidDayException() {
		super("Wrong dat !");
	}

	public InvalidDayException(String str) {
		super("Wrong Day !");
	}
}

