package DayException_1;

public class third {
public static void main(String[]args) {
	int i=10;
	int j = 10;
	try {
	
	
	throw new Exception( (i/j)+"possible"); 
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
