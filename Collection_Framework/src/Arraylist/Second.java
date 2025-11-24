package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {
public static void main(String[]args) {
	List<Integer> list=new ArrayList<Integer>();
	//int counter;
	
	for(int i=0;i<5;i++) {
	//	counter=i+1;
		list.add(i+1);
	}
	list.add(0);
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
}
}
