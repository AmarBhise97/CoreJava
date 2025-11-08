package inheritance2;

public class First {
	public static void main(String[] args) {
		Engine engine = new Engine();

	}
}

class Wehical { //////// Single and Multylevel Inheritance//////////////////
	public Wehical() {
		System.out.println("Wehical.....");

	}
}

class Four_Whiler extends Wehical {
	public Four_Whiler() {
		System.out.println("Four_Whiler...");

	}
}

class Thar extends Four_Whiler {
	public Thar() {
		System.out.println("Thar...");
	}
}

class Engine extends Thar {
	public Engine() {
		System.out.println("Engine...");

	}
}
