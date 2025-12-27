package Pattern_2;

public class Eight_pattern {
	public static void main(String[] args) {
		
/**		1 0 1 0 1 0 
		0 1 0 1 0 1 
		1 0 1 0 1 0 
		0 1 0 1 0 1 
		1 0 1 0 1 0 
*/
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print((i + j) % 2 + " ");
			}
			System.out.println();
		}
	}


}
