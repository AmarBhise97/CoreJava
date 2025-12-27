package Pattern_3;

public class Two_2 {public static void main(String[] args) {
	
/**	1 1 1 1 1 
	0 0 0 0 0 
	1 1 1 1 1 
	0 0 0 0 0 
	1 1 1 1 1 

	 */
	int n = 5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(i%2+" ");
		}
		System.out.println();
	}
}

}
