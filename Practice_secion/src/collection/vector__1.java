package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class vector__1 {
	public static void main(String[]args) {
	Vector<String> vec = new Vector<>();
	
	vec.add("A");
	vec.add("A");
	vec.add(null);
	vec.add(null);
	vec.add("c");
	vec.add("d");
	vec.add("d");
	vec.add("d");
	vec.add("d");
	vec.addElement("K");
	vec.addFirst(null);
	vec.addLast(null);
	
	
	System.out.println(vec);
	System.out.println(vec.capacity());
	System.out.println(vec.containsAll(vec));
	System.out.println(vec.remove("j"));
	System.out.println(vec.getClass());
	System.out.println(vec.reversed());
	System.out.println(vec.size());
	System.out.println(vec);
	
	Iterator<String> it = vec.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
