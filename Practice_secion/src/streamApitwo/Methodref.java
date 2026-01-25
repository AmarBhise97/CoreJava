package streamApitwo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Methodref {
	public static void main(String[]args) {
		Consumer<String> con = Demon::add;
		con.accept("Hello");
		
		Supplier<Integer> sup =Demon::add2;
		System.out.println(sup.get());
		
		Predicate<Integer> pre = Demon::add3;
		System.out.println(pre.test(21));
		
		Function<Integer ,Integer> fun =Demon::add4;
		System.out.println(fun.apply(0));
	}

}
class Demon{
	public static void add(String str) {
		System.out.println("Hello");
	}
	
	public static int add2() {
		
		int i=10;
		int b=20;
		int sum=i+b;
		return sum;
		
	}
	public static boolean add3(int i) {
		
		return i%2==0;
	}
	
	public static int add4(int i) {
		return Integer.max(1, 5)+Integer.sum(10, 5);
	}
}