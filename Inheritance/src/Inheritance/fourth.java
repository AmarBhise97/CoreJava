package Inheritance;

public class fourth {
	public static void main(String[] args) {
		Indigo ind = new Indigo();

	}
}

class Humand {
	public Humand() {
		System.out.println("Hello");
	}

	public void human_1() {

	}
}

class Aeroplane extends Humand {
	public Aeroplane() {
		System.out.println("A");
	}

	public Aeroplane(int i) {
		this();
		System.out.println("B");
	}

}

class Indigo extends Aeroplane {
	public Indigo() {
		super(20);
		System.out.println("C");
	}
}