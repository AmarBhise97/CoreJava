package Pattern_3;

public class Seven_p {
	public static void main(String[] args) {
		
	/**	 E D C B A
		 E D C B A
		 E D C B A
		 E D C B A
		 E D C B A
*/
		char i;
		char j;
		for(i='E';i>='A';i--) {
			for(j='E';j>='A';j--) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
