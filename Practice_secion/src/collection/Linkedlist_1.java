package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist_1 {
	public static void main(String[]args) {
	List<Integer> list = new LinkedList<>();
	list.add(12);
	list.add(13);
	list.add(12);
	list.add(16);
	list.add(16);
	list.add(null);
	list.add(null);
	list.add(78);
	list.add(07);
	list.add(45);
	System.out.println(list);
	list.addFirst(07);
	list.addLast(78);
	List<Integer> li = Arrays.asList(12,13,14,15,16,17);
	System.out.println(list);
	System.out.println(list.contains(null));
	System.out.println(list.hashCode());
	System.out.println(list.isEmpty());
	System.out.println(list.size());
	System.out.println(list.reversed());
	System.out.println(li.reversed());
	System.out.println(li.getClass());
	System.out.println(list.size());
	System.out.println("***********************************************");
	
	Iterator<Integer> it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("==================================");
	for(int i:list) {
		System.out.println(i);
	}
	}

}
