package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylist_1 {
	public static void main(String[]args) {
		ArrayList<Integer> list = new ArrayList<>();
		List<Integer> li=Arrays.asList(12,13,14,15,16);
		System.out.println(li.reversed());
		
		list.add(null);
		list.add(12);
		list.add(12);
		list.add(15);
		list.add(16);
		list.add(16);
		list.add(18);
		list.add(19);
		list.add(20);
		list.remove(0);
		list.addFirst(20);
		list.addLast(15);
		System.out.println(list.contains(12));
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.clone());
		
		//list.clear();
		System.out.println(list);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("====================================");
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println("*************************************");
		for(int i=0;i<list.size();i++) {
			System.out.println(i);
		}
	}

}
