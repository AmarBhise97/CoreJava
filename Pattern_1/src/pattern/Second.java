package pattern;

public class Second {
	public static void main(String[]args) {
		/**
		 * 25 20 15 10 5 
           20 16 12 8 4 
           15 12 9 6 3 
           10 8 6 4 2 
           5 4 3 2 1 
		 */
		
		
		
		
		
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
