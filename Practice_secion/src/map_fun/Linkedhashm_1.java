package map_fun;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashm_1 {
	public static void main(String[]args) {
		LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
	
		lm.put(12, 12);
		lm.put(null, 13);
		lm.put(null, 9);
		lm.put(null, 16);
		lm.put(14, 12);
		lm.put(18, 12);
		lm.put(10, 12);
		System.out.println(lm);
		System.out.println(lm.pollFirstEntry());
		System.out.println(lm.pollLastEntry());
		System.out.println(lm.remove(null, 16));
		//System.out.println(lm.pollLastEntry());
		//System.out.println(lm.pollLastEntry());
		System.out.println(lm);
	}

}
