package Pattern_2;

public class Ten_Pattern {
	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((i*j)%2+" ");
			}
			System.out.println();
		}
	}


}
