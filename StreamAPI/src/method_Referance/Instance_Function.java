package method_Referance;

import java.util.function.Function;

public class Instance_Function {
	public static void main(String[] args) {
		Demo2 demo = new Demo2();

		Function<String, String> fun = demo::addd;
		System.out.println(fun.apply("amar "));

		Function<String, String> fun2 = demo::addd1;
		System.out.println(fun2.apply("Amar "));

		Function<Integer, Integer> fun3 = demo::addd2;
		System.out.println(fun3.apply(1));

	}
}

class Demo2 {
	public String addd(String t2) {
		return t2.concat(" Amar");
	}

	public String addd1(String t1) {
		return t1.repeat(5);
	}

	public int addd2(Integer t3) {
		return t3.sum(26, 26);
	}

}
