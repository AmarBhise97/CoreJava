package method_Referance;

import java.util.function.Consumer;

public class Instance_Consumer {
	public static void main(String[]args) {
		Test t1 = new Test();
		Consumer<String> con = t1::add;
		con.accept("sd");;
		
		Consumer<String> con2 = t1::add2;
		con2.accept("Bhise");
		
		Consumer<String> con3 = t1::add3;
		con3.accept("a ");
		
		
	}

}
class Test{
	public void add (String s) {
		System.out.println("this is static methid.....");
	}
	
	public void add2(String s) {
		System.out.println(s.concat("Amar"));
	}
	
	public void add3(String s) {
		System.out.println(s.repeat(5));
	}
}
