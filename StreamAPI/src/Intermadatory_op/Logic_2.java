package Intermadatory_op;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logic_2 {
	public static void main(String[] args) {
		/**
		 * aaabbddccceerrrrgggdefggg
		 * abcdefg
		 * gfedcba
		 * GFEDCBA
		 */
		
		String str ="aaabbddccceerrrrgggdefggg";
		
		char[] chars = str.toCharArray();
		List <Character> list = new ArrayList<Character>();
		for (Character c : chars) {
			list.add(c);
		}
		System.out.println(list);
		list.stream()
		
		.map((i)->{;return i.toString().toUpperCase();})
		.distinct()
		.sorted(new stringcompare())
		.forEach((i)->{System.out.println(i);});
		

	}
}
class stringcompare implements Comparator<String >{

	
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}