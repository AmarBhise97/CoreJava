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
		
		Consumer<Integer> con2 = Student1::add1;
		con2.accept(10);
	}

}
class Student1{
	public static void add (String s) {
		System.out.println("this is static methid.....");
	}
	
	public static void add1(Integer a) {
		System.out.println(a.max(100,5000));
		
	}
}
