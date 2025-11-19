package Propagationofexception;

public class VoterSystem {
public static void main(String[]args) {
	VotingDay.castvote(19, true);
}
}
class VotingDay{
	public static void castvote(int age,boolean isIndian) {
		
	
	try {
		if(age<18) {
			throw new InvalidAgeException("ja ghari");
		}
		System.out.println("PLEASE VOTE:");
		
	}
	catch(InvalidAgeException ex) {
		//ex.printStackTrace();
		System.out.println(ex.getMessage());
	}
	try {
		if( isIndian==false) {
			throw new NotIndianException("! But you are not an indian");
			
		}
		System.out.println("You are an 18+..Please vote");
		
	}
	catch(NotIndianException ex) {
		//ex.printStackTrace();
		System.out.println(ex.getMessage());
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	}
}