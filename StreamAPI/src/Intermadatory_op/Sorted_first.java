package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;

public class Sorted_first {
public static void main(String[]args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(12);
	list.add(15);
	list.add(34);
	list.add(23);
	list.add(15);
	list.add(78);
	list.add(05);
	System.out.println(list);
	list.stream().sorted().forEach((i)->{System.out.println(i);});
	
}
}
