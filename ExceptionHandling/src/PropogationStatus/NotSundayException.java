package PropogationStatus;

public class NotSundayException extends Exception {
	int code;
	public NotSundayException(String str,int code ,Throwable t) {
		super(str,t);
		this.code=code;
		
	}
	public int getcode() {
		return this.code;
		
	}

}
