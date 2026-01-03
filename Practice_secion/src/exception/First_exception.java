package exception;

public class First_exception {
	public static void main(String[]args) {
		int i=10;
		int j=0;
		//System.out.println(i/j);
		try {
			System.out.println(i/j);
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		finally {
			System.out.println("Printing finally");
		}
		
	}

}
