package objectPractice;

public class Fourth {
public static void main(String[]args) {
	car c1= new car();
	car c2 = new car();
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	String str= new String("ab");
	String str2= new String("ab");
	System.out.println(str.hashCode());
	System.out.println(str2.hashCode());
	
}
}
class car{
	int id;
	String name;
	
}