package Set;

import java.util.HashSet;
import java.util.Set;

public class Third {
	public static void main(String[] args) {
		String str = "ABC";
		String str2 = new String("ABCD");

		Set<String> set = new HashSet<String>();
		set.add("12");
		set.add(str2);
		set.add(str);
		System.out.println(set);

	}
}
