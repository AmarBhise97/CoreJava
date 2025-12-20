package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Fourth {
public static void main(String[]args) {
	List <Integer>list = new ArrayList();
	List<Integer> list2=new ArrayList<Integer>();
	list.add(3);
	list.add(11);
	list.add(2);
	list.add(5);
	for(int i=list.get(2);i<=list.get(list.size()-1);i++) {
		System.out.println(i);
		if(list.contains(i)==false) {
			list2.add(i);
		
		}
	}
	System.out.println(list2);
}
}
