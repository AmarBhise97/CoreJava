package linkedlist;

import java.util.LinkedList;

public class First {
	public static void main(String[]args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(10);
		list.add(34);
		list.add("2345");
		list.add("amar");
		list.addAll(list);
		System.out.println(list);
		System.out.println(list.contains("amark"));
		System.out.println(list.set(0, 400));
		//list.clear();
		System.out.println(list.isEmpty());
		System.out.println("List:"+list);
		System.out.println("=========");
		System.out.println(list.size());
		System.out.println("==========");
		for(int i= 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.addFirst(list);
		System.out.println(list);
		
	}
}
