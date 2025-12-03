package Intermadatory_op;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Distinct_one {
public static void main(String[]args) {
	List<String> list = new ArrayList<String>();
	/**
	 * Distinct maintain the unikeness.
	 */
	list.add("AB");
	list.add("AK");
	list.add("AB");
	list.add("AK");
	
	System.out.println(list);
	list.stream().distinct().sorted().forEach((i)->{System.out.println(i);});
	
	
	List<Integer> l1 = new LinkedList<Integer>();
	l1.add(24);
	l1.add(78);
	l1.add(78);
	l1.add(11);
	l1.add(77);
	l1.add(07);
	l1.add(07);
	System.out.println("======================================");
	System.out.println(l1);
	l1.stream().distinct().forEach((j)->{System.out.println(j);});	
}
}
