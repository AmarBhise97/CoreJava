package pattern;

public class Third {
	public static void main(String[]args) {
		int n = 5;
		int k = 25;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				System.out.print(k + " ");
				k--;
			}
			System.out.println();
		}

	}

}

	


