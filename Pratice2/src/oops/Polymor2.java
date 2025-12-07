package oops;

public class Polymor2 {
	public static void main(String[]args) {
		Tata t1 = new Tata();
		t1.add();

}
}
class Car{
	public void add() {
		System.out.println("Nano");
	}
}
class Tata extends Car{
	public void add() {
		System.out.println("VD");
	}
}
