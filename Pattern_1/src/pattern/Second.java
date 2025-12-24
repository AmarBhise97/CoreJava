package pattern;

public class Second {
	public static void main(String[]args) {
		int x = 5;
		int h = 25;
		for (int i = x; i >= 1; i--) {
			for (int j = x; j >= 1; j--) {
				System.out.print(j * i + " ");
				h--;
			}
			System.out.println();
		}
	}

}
