package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_1 {
	public static void main(String[]args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(null);
		set.add(null);
		set.add(12);
		set.add(13);
		set.add(16);
		set.add(18);
		set.add(19);
		set.add(14);
		set.add(10);
		System.out.println(set);
		set.remove(12);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.getClass());
		System.out.println(set.contains(14));
		System.out.println(set.clone());
		
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
