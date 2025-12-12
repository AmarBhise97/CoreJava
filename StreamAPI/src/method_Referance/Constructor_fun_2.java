package method_Referance;

import java.util.function.Function;

public class Constructor_fun_2 {
	public static void main(String[]args) {
		Function<String,Car1> fun = Car1::new;//only link the objects
		System.out.println(fun.apply("my name is Amar").getlength());//logic will print
		
	}

}
class Car1{
	String Demo;
	
	public Car1(String s) {
		
		this.Demo = s;
	}
	public int getlength() {
		return Demo.length();
	}
}
