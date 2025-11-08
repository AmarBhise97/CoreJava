package inheritance2;

public class DymondProb {
	public static void main(String[] args) {
		Milky_way milky = new Milky_way();
		milky.dis();
		milky.Disc();
 
	}
}

class Universe {
	String universe_name = "ABS0";

	public void dis() {
		System.out.println(this.universe_name);
	}
}

class Galaxy {
	String name = "sageee";

	public void disc() {
		System.out.println(this.name);

	}
}

//class Milky_way extends Universe,Galaxy  //////Dymond Problem shown/////
class Milky_way extends Universe {
	String name = "Milkyway";

	public void Disc() {
		super.dis();
		System.out.println(this.name);
	}
}