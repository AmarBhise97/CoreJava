package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class First {
public static void main(String[]args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(7);
	list.add(7);
	list.add(7);
	list.add(1);
	list.add(2);
	list.add(null);
	list.add(null);
	list.remove(5);
	
	System.out.println(list);
	System.out.println(list.size());
}
}
