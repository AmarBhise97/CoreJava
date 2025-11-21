package Collection_1;

public class First {
	public static void main(String[] args) {
		/**
		 * in this formate code will be easy but so long thats why use the lambda
		 * expression
		 */
		School school = new Gocchi();
		System.out.println(school.add("10", "10"));
		School school1 = new Bata();
		System.out.println(school1.add(10, 40));

	}
}

@FunctionalInterface
interface School<S> {

	public S add(S i, S j);
	// void get(String d);
	/**
	 * in functional interface it can only one abstract method are used.
	 */

}

class Gocchi implements School<String> {
	/**
	 * if i can change the type safe than i can use another class and implements the
	 * method in class .
	 */

	public String add(String i, String j) {
		return i + j;

	}

}

class Bata implements School<Integer> {

	public Integer Multy(Integer i, Integer j) {

		return i * j;
	}

	public Integer add(Integer i, Integer j) {

		return i * j;
	}

}