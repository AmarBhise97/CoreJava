package streamApitwo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Constructorref {
	public static void main(String[]args) {
		Demon1 d1 = new Demon1();
		Consumer<String > con =d1::add;
		con.accept("hi");
		
		Predicate <Integer> pre =d1::add1;
		System.out.println(pre.test(1));
		
		Supplier<Integer> sup = d1::add2;
		System.out.println(sup.get());
		
		Function<Integer,Float> fun = d1::add3;
		System.out.println(fun.apply(0));
	}

}
class Demon1{
	public void add(String str) {
		System.out.println("hi....");
	}
	
	public boolean add1(int i) {
		return i%2==0;
	}
	public int add2() {
		int i = 20;
		int j= 30;
		int sum = i+j;
		return sum;
	}
	public float add3(float f) {
		return  Float.max(10f, 30f);
	}
}
