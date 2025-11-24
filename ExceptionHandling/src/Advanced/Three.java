package Advanced;

public class Three {
	public static void main(String[] args) throws InvalidDayException{
		int age =80;
		
		try {
			
		
		if (10 > 5 && 40 > 30) {
			throw new InvalidDayException("XYZ");

		}
		
		
		}
		catch(InvalidDayException ex) {
			System.out.println(ex.getMessage());
		}
		finally
		{System.out.println("The  End");}
		
		
		
		
	}
}
