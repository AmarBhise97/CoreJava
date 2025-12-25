package pattern;

public class Sixth {
	public static void main(String[]args) {
		
		/*
		 * 25 24 23 22 21 
           20 19 18 17 16 
           15 14 13 12 11 
           10 9 8 7 6 
           5 4 3 2 1 
		 */
		int n = 5;
		int t = 25;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				System.out.print(t + " ");
				t--;
			}
			System.out.println();
		}
	
	}

}
