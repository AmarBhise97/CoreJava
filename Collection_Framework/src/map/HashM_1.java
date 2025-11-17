package map;

import java.util.HashMap;
import java.util.Map;

public class HashM_1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Amar");
		map.put(10, "Rohit");
		map.put(5, "Gagan");
		map.put(1, "Ankit");// in hashmap insertation order not maintain
		                      // but sorting only keys
		map.put(9, "Arti");
		System.out.println(map);
		System.out.println(map.get(10));//get the value for key 10
		System.out.println("Remove 7 : "+map.remove(7));
		System.out.println(map);
		System.out.println(map.containsKey(1));//check is available or
		                                          //notavailable
	}
}
