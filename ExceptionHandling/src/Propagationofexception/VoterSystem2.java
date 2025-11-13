package Propagationofexception;

public class VoterSystem2 {
public static void main(String[]args)// throws InvalidAgeException,NotIndianException
{
	try {
		
	
	Voting.CheakingEligiblity(11);
	}
	catch(Exception ex) {
		ex.printStackTrace();
		System.out.println(ex.getMessage());
	}
}
}

class Voting{
	static public void CheakingEligiblity(int age )throws InvalidAgeException,NotIndianException {
		if (age<18) {
			throw new InvalidAgeException();
		}
		if(age>18) {
			throw new NotIndianException(" Indian");
			
		}
	}
}