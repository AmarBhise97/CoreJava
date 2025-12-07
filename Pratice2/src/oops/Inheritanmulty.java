package oops;

public class Inheritanmulty {
	public static void main(String[]args) {
		Runcar en = new Runcar();
		System.out.println();
		Evcar ev =new Evcar();
		
		
	}

}
class EnginCar{
	public EnginCar() {
		System.out.println("Enginecar");
	}
	
}

	

class Runcar extends EnginCar {
	
	public Runcar() {
		System.out.println("Runcar");
	}
}
class Evcar extends EnginCar {
	public Evcar() {
		System.out.println("EVcar");
	}
	
}
