package oops;

public class Interface_1 {
	public static void main(String[]args) {
		Aeroplane ae = new Aeroplane();
		ae.visaCard("visa");
		ae.visaPrinting();
	}

}
interface Visa{
	public static final int id = 12;
	public static final String name="Amar";
	
	
	
	abstract void visaCard(String visaname);
	//private static String name1="Ankit";// private and Protected are not used in interface.
	
	default void visaPrinting() {
		System.out.println("Printing the visa......");
	}
	
}
class Aeroplane implements Visa{

	
	public void visaCard(String visaname) {
	
		System.out.println("visacard is printing.....");
	}
	
}
