package Inheritance;

public class First {
	public static void main(String[] args) {
		Amar a1 = new Amar();
		a1.walk();
		a1.Laugh();
		a1.City();

//		Human h1 = new Amar();
//		   h1.walk();
//////		h1.Laugh();
////		
		
//		Amar a2 = new Human();//////////////// Not Allowed///

	}
}

class Human {
	public void walk() {
		System.out.println("Human is walking....");
	}

	public void Laugh() {
		System.out.println("Human is Laughifing....");
	}
}

class Amar extends Human {
	public void City() {
		System.out.println("Pune");
	}
}
