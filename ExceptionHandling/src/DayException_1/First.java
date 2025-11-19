package DayException_1;

public class First {
public static void main(String[]args) {
	int k=10;
	int j=0;
	try {
		
		System.out.println(k/j);
	}
	catch(Exception ex) {
		System.out.println(ex.getLocalizedMessage());
	}
	//System.exit();
	
	finally {
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
			
		}
		
		System.out.println("Happyyyyy");
		
	}
	//System.out.println(k/j);
}
}
