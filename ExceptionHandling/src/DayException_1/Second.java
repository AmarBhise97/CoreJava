package DayException_1;

public class Second {
public static void main(String[]args) {
	int Money=5002;
	int Amount=1400;
	try {
		if(Money>Amount) {
			throw new Exception("Insufficiant Amount");
		}
		System.out.println(Money - Amount+"Amount paid");
		
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
		
	}
}
}
