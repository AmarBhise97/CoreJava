package pattern;

public class Seventh {
	public static void main(String[] args) {
		
		/**
		 * 49 47 45 43 41 
           39 37 35 33 31 
           29 27 25 23 21 
           19 17 15 13 11 
           9 7 5 3 1 

		 */
		int n = 5;
		int t = 49;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				System.out.print(t + " ");
				t = t - 2;

			}
			System.out.println();
		}
	}


}
