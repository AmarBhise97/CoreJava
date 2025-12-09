package method_Referance;

import java.util.function.Consumer;

public class Second_Consumer {
	public static void main(String[]args) {
		/*
		 * Consumer<Integer> con =(i)->{System.out.println(12);};
		 * con.accept(1);
		 */
		
		
		
		Consumer <String> con = Student1:: add;
		con.accept("ad");
	}

}
class Student1{
	public static void add (String s) {
		System.out.println("this is static methid.....");
	}
}
