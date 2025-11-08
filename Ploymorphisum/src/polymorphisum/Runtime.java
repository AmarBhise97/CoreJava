package polymorphisum;

public class Runtime {

	public static void main(String[] args) {
		Kurukshetra kurukshetra = new Kurukshetra();
		kurukshetra.collection();

	}

}

class Movie {/////////////// Runtime/Overriding //////////////////////
	public void collection() {
		System.out.println("Collection is a parent......");
	}
}

class Kurukshetra extends Movie {
	public void collection() {
		System.out.println("Collection is a child......");
	}
}