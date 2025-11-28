package Intermadatory_op;

import java.util.List;
import java.util.Vector;

public class Second {
public static void main(String[]args) {
	List<Integer> list = new Vector<Integer>();
	list.add(234);
	list.add(657);
	list.add(768);
	list.add(105);
	list.add(212);
	list.add(439);
	
	System.out.println(list);
	list.stream().forEach ( i ->System.out.println(i>200));
}
}
