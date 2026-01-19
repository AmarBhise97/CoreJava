package First_Mock;

public class Static1 {
/**    xys-> first static block
	   10 ->second static block
	   0 -> method will print **/
	
	

	static {
		System.out.println("xys");
	}

	public static void main(String[] args) {

		Static1.add();
	}

	static int id = 10;

	public static void add() {
		id = 0;
		System.out.println(id);
	}

	static {

		System.out.println(id);
	}

}
