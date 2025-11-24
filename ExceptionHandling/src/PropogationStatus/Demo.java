package PropogationStatus;

public class Demo {
public static void main(String []args) {
	int age =10;
	try {
       if(7>0) {
    	   throw new NotSundayException("No Holiday",300, new Throwable("Today id Saturday"));
    	   
       }
       System.out.println("Exactly correct");
	}
	catch(NotSundayException ex) {
		System.out.println(ex.getMessage());
		System.out.println(ex.getcode());
		System.out.println(ex.getCause());
	}
}
}
