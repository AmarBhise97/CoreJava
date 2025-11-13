package DayException_1;

public class third {
public static void main(String[]args) {
	int i=10;
	int j = 0;
	try {
	System.out.println(i/j);
	}
	catch(ArithmeticException ex) {
	System.out.println(ex.getMessage());	
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	finally {
		System.out.println("  ...the end....");
		
	}
	System.out.println("Good Evening");
	
	
}
}
