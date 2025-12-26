package Pattern_2;

public class Fifth_Pattern {
	public static void main(String[] args) {
	/** 1 2 3 4 5 
		2 3 4 5 6 
		3 4 5 6 7 
		4 5 6 7 8 
		5 6 7 8 9 
		*/
		
		
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + j - 1 + " ");

			}
			System.out.println();
		}
	}

}
