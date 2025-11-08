package polymorphisum;

public class CompileTime {
	public static void main(String[] args) {
		Animal1 animal = new Animal1();

	}
}

class Animal1 {
	String name;
	String varity;
	String color;
	String capacity;
	double weight;

	public static void animalDetails(String name, String varity, String color, String capacity) {

	}

	public static void animalDetails(String name, String varity, String color, String capacity, double weight) {

	}
}