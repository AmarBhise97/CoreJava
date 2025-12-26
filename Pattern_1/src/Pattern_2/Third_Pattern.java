package Pattern_2;

public class Third_Pattern {
	public static void main(String[] args) {
		int n = 5;
		int x;

		for (int i = 1; i <= n; i++) {
			x = n - i + 1;
			for (int j = 1; j <= n; j++) {
				System.out.print(x + " ");
				x = x + n;
			}
			System.out.println();
		}
	}

}
