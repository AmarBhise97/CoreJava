package basics;

public class Constructor_1 {
	public static int counter;
	public static void count() {
		counter=counter+1;
		System.out.println("counter "+counter);
	}
	public static void main(String[]args) {
		Constructor_1.count();
		Constructor_1.count();
		Constructor_1.count();
		Constructor_1.count();
		Constructor_1.count();
		
	}

}

