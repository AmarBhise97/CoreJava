package Inheritance;

public class Second {

	public static void main(String[] args) {
		BangolTiger bt = new BangolTiger();
	}
}

class Animal {
	public Animal() {
		System.out.println("Animal is walking...");

	}
}

class Tiger extends Animal {
	public Tiger() {
		System.out.println("Tiger is walking...");

	}
}

class BangolTiger extends Tiger {
	public BangolTiger() {
		System.out.println("BangolTiger is walking");
	}
}
