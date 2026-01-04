package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedhash_1 {
	public static void main(String[]args) {
		LinkedHashSet<String > linked= new LinkedHashSet<>();
		linked.add("Amar");
		linked.add("ankit");
		linked.add(null);
		linked.add("Amar");
		linked.add(null);
		linked.add("Rutik");
		linked.add("Sager");
		linked.add("Rushab");
		linked.add("Pant");
		linked.add("Am");
		
		System.out.println(linked);
		System.out.println(linked.size());
		System.out.println(linked.getFirst());
		
		
		
		Iterator<String> it = linked.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		}

}
