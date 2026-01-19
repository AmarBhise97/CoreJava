package First_Mock;

public class String1 {
	public static void main(String[]args) {
		System.out.println("Amar"+null);
		System.out.println(null+"Amar");
		//System.out.println(0+null);-->run time Error
		//System.out.println(null+0);--.run time error
		System.out.println(null+""+0);
		System.out.println(0+""+null);
		
	}

}
