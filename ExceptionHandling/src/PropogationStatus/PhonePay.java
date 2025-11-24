

package PropogationStatus;

public class PhonePay {
	public static void main(String[] args) {//throws InvalidPinException, InsuffiecientAmountException  {
		try {
			
		
		Payment.doPay("00122", 400000);
		}
		catch( InsuffiecientAmountException ex) {
			System.out.println(ex.getMessage()+"::"+ex.getcode()+" code "+" caused by"+ex.getCause());
		}
		
		catch(InvalidPinException ex ) {
			System.out.println(ex.getMessage());
			System.out.println("Code"+ex.getcode());
		}
		
		System.out.println("...............The End..................");
	}
}

class Payment {
	public static void doPay(String str, int Amount) throws InvalidPinException, InsuffiecientAmountException {
		String pass = "00122";
		int balance = 70000;

		if (pass.equals(str) == false) {
			throw new InvalidPinException("Wrong UPI Password", 100, new Throwable("Wrong Password Enterned"));
		}
		System.out.println("Initiating Payment..");
		System.out.println("doing Payment.......");

		if (Amount > balance) {
			throw new InsuffiecientAmountException("low Amount", 500);
		}
		balance = balance - Amount;
		System.out.println("now the balance is :" + balance);
	}

}

class InvalidPinException extends Exception {
	int code;

	public InvalidPinException(String str, int code, Throwable t) {
		super(str, t);
		this.code = code;

	}

	public InvalidPinException(String str) {
		super(str);
	}

	public int getcode() {
		return this.code;
	}
}

class InsuffiecientAmountException extends InvalidPinException {
	int code;

	public InsuffiecientAmountException(String str, int code) {
		super(str);
		this.code = code;
		
	}

	public int getcode() {
		return this.code;
	}
}