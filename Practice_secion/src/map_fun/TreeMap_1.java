package map_fun;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_1 {
	public static void main(String[]args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(12, "Amar");
		tm.put(4, null);
		tm.put(12, null);
		tm.put(6, "Amar");
		tm.put(0, "Suraj");
		tm.put(5, "Amar");
		tm.put(19, "Amar");
		tm.put(34, "Amar");
		System.out.println(tm);
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.remove(37));
		
		System.out.println(tm);
		
		for(Entry<Integer,String> e:tm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
