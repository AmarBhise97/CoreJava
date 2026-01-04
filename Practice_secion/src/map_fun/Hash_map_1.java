package map_fun;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hash_map_1 {
	public static void main(String[]args) {
		HashMap<Integer,Integer> hs = new HashMap<>();
	    hs.put(null, null);
	    hs.put(1, null);
	    hs.put(1, 5);
	    hs.put(1, 9);
	    hs.put(null, 3);
	    hs.put(4, 7);
	    hs.put(2, 9);
	    hs.put(0, 6);
	    hs.put(6, 3);
	    hs.put(3, null);
	    System.out.println(hs);
	    System.out.println("======================================");
	    
		HashMap<String,Integer> h1 = new HashMap<>();
		h1.put(null, null);
		h1.put("A", null);
		h1.put("D", null);
		h1.put("C", null);
		h1.put("B", null);
		h1.put("A", 8);
		System.out.println(h1);
		for(Entry<String, Integer> e :h1.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	    
	}

}
