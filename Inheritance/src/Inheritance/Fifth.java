package Inheritance;

public class Fifth {
	public static void main(String[] args) {
		Two_wheeler to = new Two_wheeler("Harley_Daviscon");
	}
}

class Vehicle {
	String name;

	public Vehicle(String name) {
		this.name = name;
		System.out.println("value assine to the supper class:" + name);
	}
}

class Four_wheeler extends Vehicle {

	public Four_wheeler(String name) {
		super(name);

	}

}

class Three_wheeler extends Four_wheeler {
	public Three_wheeler(String name) {
		super(name);
	}
}

class Two_wheeler extends Three_wheeler {

	public Two_wheeler(String name) {
		super(name.toUpperCase());
		// TODO Auto-generated constructor stub
	}

}
