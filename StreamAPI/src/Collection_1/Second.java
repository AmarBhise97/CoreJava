package Collection_1;

import java.util.function.Predicate;

public class Second {
	public static void main(String[] args) {
     Predicate<Integer> pre=new EvenNum();
     System.out.println(pre.test(57));
	}
}

class EvenNum implements Predicate<Integer> {
	/**
	 * predicate return only boolean like true and false.
	 */

	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;

		}
		return false;
	}

}
