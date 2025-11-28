package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class First {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(234);
		list.add(459);
		list.add(780);
		list.add(129);
		list.add(102);
		list.add(658);
		Predicate<Integer> pre = (i) -> {
			new Graterthan();
			return i > 400;
		};

		System.out.println(pre);
	}

}

class Graterthan implements Predicate<Integer> {

	public boolean test(Integer i) {
		return i >400;
	}
}