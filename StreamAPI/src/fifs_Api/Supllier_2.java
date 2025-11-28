package fifs_Api;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Supllier_2 {
	public static void main(String[] args) {
		ArrayList<Integer> ara = new ArrayList<>();
		ara.add(23);
		ara.add(56);
		ara.add(67);
		ara.add(34);
		ara.add(78);

		System.out.println(ara);

		System.out.println("==============================================");

		Consumer<ArrayList<Integer>> cons = (i) -> {
			for (int j : i) {
				System.out.println(j);
			}
		};
		cons.accept(ara);
		System.out.println("==================================================");
		
		Predicate <ArrayList<Integer>> pre = (i)->{
			return ara.size()>=5;
			
		};
		System.out.println(pre.test(ara));
		System.out.println("=======================================================");
		
		Function<ArrayList<Integer>,Integer> fun =(i)->{
			return i.get(3);
		};
		System.out.println(fun.apply(ara));
	}
}
