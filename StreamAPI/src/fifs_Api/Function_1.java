package fifs_Api;

import java.util.function.Function;

public class Function_1 {
public static void main(String[]args) {
	Function<Integer ,Double> fun = (t)->{return Double.valueOf(t);};
	Function<Integer ,String> fun2 = (i)->{return String.valueOf(i);};
	System.out.println(fun.apply(45));
	System.out.println( fun.apply(34).getClass());
	
}
}
