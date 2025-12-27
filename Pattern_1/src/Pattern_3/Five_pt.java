package Pattern_3;

public class Five_pt {
	public static void main(String[] args) {
		
	/**	A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 
*/
		char i;
		char j;
		for(i='A';i<='E';i++) {
			for(j='A';j<='E';j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
