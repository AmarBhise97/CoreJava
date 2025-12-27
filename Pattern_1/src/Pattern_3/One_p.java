package Pattern_3;

public class One_p {
	public static void main(String[] args) {
		
/**		0 0 0 0 0 
		1 1 1 1 1 
		0 0 0 0 0 
		1 1 1 1 1 
		0 0 0 0 0 
*/
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}

}
