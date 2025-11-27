package fifs_Api;

import java.util.function.Function;

public class Funct_2 {
public static void main(String[]args) {
	Function <Integer,Double> fun =(i)-> { System.out.println("After");
	return Double.valueOf(i);};
	
	Function <String ,Integer> fun2 =(t)->{System.out.println("Before");
	return Integer.parseInt(t);};
	
	Function<String, Double> fun3 =fun.compose(fun2);
	System.out.println(fun3.apply("50"));
	}
	
	
}

