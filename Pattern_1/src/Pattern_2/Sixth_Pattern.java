package Pattern_2;

public class Sixth_Pattern {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((2 * (i + j) - 1) + " ");
			}
			System.out.println();
		}
	}

}
