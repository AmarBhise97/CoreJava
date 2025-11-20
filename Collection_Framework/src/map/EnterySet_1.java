package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EnterySet_1 {
	public static void main(String[]args) {
	Map<Integer,String> mp = new HashMap<>();
	mp.put(101, "Amar");
	mp.put(105, "Rushi");
	mp.put(104, "Kartik");
	mp.put(103, "Suresh");
	mp.put(102, "Ashwin");
	mp.put(106, "Kartiki");
	System.out.println(mp);
	System.out.println(mp.entrySet());
    for(Entry<Integer, String> e: mp.entrySet() ) {
    	System.out.println(e.getKey());
    	System.out.println(e.getValue());
    	
    }
    for( Integer i:mp.keySet())
    {
    	System.out.println(i);
    }
    for(String s: mp.values())
    {
    	System.out.println(s);
    }
}
}

