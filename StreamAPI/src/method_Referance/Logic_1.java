package method_Referance;

import java.util.function.Function;

public class Logic_1 {
	public static void main(String[]args) {
		
		String str ="Demo";
		
		Function<String , Integer> fun =str::compareTo; 
		System.out.println(fun.apply("Eemo"));
		
	}

}
