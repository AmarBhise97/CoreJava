package equals;

import java.util.Objects;

public class Demo {
	public static void main(String[] args) {
		Aeroplane ae = new Aeroplane();
		ae.name = "Indigo";
		ae.engine = 45.60;
		ae.seats = 100;
		System.out.println(ae.hashCode());
		
		Aeroplane ae1 = new Aeroplane();
		ae1.name = "Indigo";
		ae1.engine = 45.60;
		ae1.seats = 100;
		
		System.out.println(ae1.hashCode());
		System.out.println(ae.equals(ae1));
	}
}

class Aeroplane {
	static int counter = 1;

	public Aeroplane() {
		counter++;

	}

	String name;
	double engine;
	int seats;

	public int hashCode() {
		return Objects.hash(name,engine);
	}

	public boolean equals(Object obj) {
		Aeroplane ae3 = (Aeroplane) obj;
		return (this.name.equals(ae3.name) && this.engine == ae3.engine && this.seats == ae3.seats);
	}
}