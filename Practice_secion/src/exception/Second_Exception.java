package exception;

public class Second_Exception {
	public static void main(String[]args) {
		int age = 10;
		try {
		if(age<18) {
			throw new Exception("Invalid age");
		}
		System.out.println("valid for vote");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
	}

}
