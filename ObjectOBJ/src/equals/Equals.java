package equals;

public class Equals {
	
	    public static void main(String[] args) {
	        String a = "hello";
	        String b = "hello";
	        String c = new String("hello");

	        System.out.println(a.equals(b)); // true
	        System.out.println(a.equals(c)); // true
	    
	}

}
