package Advanced;

public class first
{
public static void main(String[]args) {
	Aeroplane.fly(100);
}
}

class Aeroplane
{
	  static public void fly(int i) {
		
		  try {
			  if(i != 100) {
				  throw new RuntimeException("Invalid Argument");
				  
			  }
			  System.out.println("Aeroplane is in the sky");
		  }
		 
		  
		  catch(Exception ex) {
			  System.out.println(ex.getMessage());
			  
		  }
		 
	  }
	  
}