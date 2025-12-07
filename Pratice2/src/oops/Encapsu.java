package oops;

public class Encapsu {
	public static void main(String[] args) {
         Animal an = new Tiger();
          an.race();
          an.drink(0);
          
          
       
	}

}

abstract class Animal {
	public Animal() {
		System.out.println("Animal is printing......");

	}

	abstract void race();

	public void drink(int a) {
		a=50;

		System.out.println("animal is drinking");

	}
}

class Tiger extends Animal{
	public Tiger() {
		System.out.println("Tiger is Printing....");
		
	}

	
	void race() {
		System.out.println("Tiger is running...");
		
	}
	public void drink() {
		super.drink(0);
	this.drink(0);
		System.out.println("Tiger is drinking");
	}
}
