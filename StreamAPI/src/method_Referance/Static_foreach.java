package method_Referance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Static_foreach {
	public static void main(String[] args) {

		Stud stud = new Stud();
		Predicate<Integer> pre = stud::add;
		System.out.println(pre.test(21));

		Predicate<Float> pre1 = stud::add2;
		System.out.println(pre1.test(200f));
		
		String str = "bcderdf";
		Predicate<String> pre3 = str::endsWith;
		System.out.println(pre3.test("b"));
		
		Predicate <String> pre4 = str::startsWith;
		System.out.println(pre4.test("b"));
		
		
		

	}
}

class Stud {
	
	public boolean add(int i) {
		return i % 2 == 0;
	}

	public boolean add2(float i) {
		return i > 50;
	}
}