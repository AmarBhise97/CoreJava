package abstraction;

public class First {
	public static void main(String[] args) {
		Tiger ti = new Tiger();
		ti.drink();
		ti.race();
		System.out.println(ti.racing("Very fast"));
	}
}

abstract class Animal {
	public Animal() {
		System.out.println("Object.......");
	}

	abstract void race();

	abstract String racing(String n);

	public void drink() {
		System.out.println("i am running....ground");
	}
}

class Tiger extends Animal {
	public Tiger() {
		System.out.println("Tiger running....");
	}

	void race() {
		System.out.println("Tiger race...");
	}

	String racing(String n) {
		return n;
	}

}
