package Propagationofexception;

public class VoterSystem2 {
public static void main(String[]args)// throws InvalidAgeException,NotIndianException
{
	try {
		
	
	Voting.CheakingEligiblity(19,true);
	}
	catch(Exception ex) {
		ex.printStackTrace();
		System.out.println(ex.getMessage());
	}
}
}

class Voting{
	static public void CheakingEligiblity(int age, boolean from ) {
		if (age<18) {
			throw new InvalidAgeException();
		}
		if(from!=true) {
			throw new NotIndianException(" Indian");
			
		}
		else {
			System.out.println("not indian");
		}
	}
}