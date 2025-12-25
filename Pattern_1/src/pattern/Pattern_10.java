package pattern;

public class Pattern_10 {
	public static void main(String[] args) {
		
		/**
		 * 1 1 2 1 
           1 2 2 2 
           1 3 2 3 
           1 4 2 4 
           1 5 2 5 

		 */
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(j + " " + i + " ");
			}
			System.out.println();
		}
	}

}
