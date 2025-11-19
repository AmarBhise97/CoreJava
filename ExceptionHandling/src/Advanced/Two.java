package Advanced;

public class Two {
	public static void main(String[] args) {

		int age = 33;
		try {
			if (age < 18) {
				throw new wrongAgeException("Wrong Age");
			}
			System.out.println("You are Correct");
		} 
		catch (wrongAgeException ex) {
			System.out.println(ex.getMessage());
		}

	}

}


class wrongAgeException extends Exception
{
	public wrongAgeException(String str) {
		super("Wrong Insan......");
		//super(str);
	}
}
