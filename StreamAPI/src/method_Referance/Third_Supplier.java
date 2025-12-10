package method_Referance;

import java.util.function.Supplier;

public class Third_Supplier {
	public static void main(String[] args) {

		/**
		 * Supplier<Integer> sup = ()->(1+1); System.out.println(sup.get());
		 */

		Supplier<Long> sup = Demo::add;
		System.out.println(sup.get());
		
		Supplier<Integer> sup1= Demo::add2;
		System.out.println(sup1.get());
		
		Supplier<Double> sup2=Demo::add3;
		System.out.println(sup2.get());

	}

}

class Demo {
	public static long add() {
		double d = Math.random() * 100;
		System.out.println(d);
		long l = (long) d * 10;
		System.out.println(l);
		return l;

	}

	public static int add2() {
		int i = Math.min(100, 2);
		return i;
	}
	
	public static double add3() {
		double d=Math.max(100.5, 500.6);
		return d;
	}
}
