package method_Referance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Arbitary_one {
	public static void main(String[] args) {
		Function<String, Integer> fun = String::length;
		System.out.println(fun.apply("ABCD"));
		System.out.println(fun.apply("AMARBHISE"));

		
		System.out.println("===============================================");
		
		Predicate<String> pre =String::isEmpty;
		System.out.println(pre.test(""));
		System.out.println(pre.test("  no "));
		
		System.out.println("===============================================");

		Consumer<Integer> con = System.out::println;
		List<String> list = Arrays.asList("Amar", "Suresh", "kartik", "Suraj");
		list.stream().map(String::length).forEach(con);
		
		System.out.println("=================================================");
		
		
		
	

	}

}
