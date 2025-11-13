package DayException_1;

public class fifth {
public static void main(String[]args) {
	int age=12;
	try {
	if(age<18) {
		throw new Exception ("Invalid age");
	}
	System.out.println("you can vote");
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
		
	}
	finally {
		System.out.println("END");
	}
}
}
