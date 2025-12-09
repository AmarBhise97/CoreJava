package method_Referance;

import java.util.function.Function;

public class Fourth_Function {
	public static void main(String[] args) {

		/**
		 * Function<String,String> fun =(i)->(i.concat(i));
		 * System.out.println(fun.apply("dfgghj"));
		 */

		Function<String, String> fun1 = Employee::addd;
		System.out.println(fun1.apply("Bhise"));

		Function<String, String> fun2 = Employee::addd1;
		System.out.println(fun2.apply("Amar "));
		
		Function<Integer,Integer> fun3 = Employee::addd2;
		System.out.println(fun3.apply(5));

	}

}

class Employee {

	public static String addd(String t2) {
		return t2.concat(" Amar");
	}

	public static String addd1(String t1) {
		return t1.repeat(5);
	}

	public static int addd2(Integer t3) {
		return t3.sum(26, 26);
	}

}
