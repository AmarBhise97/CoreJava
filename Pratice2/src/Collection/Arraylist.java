package Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String[]args) {
		List <Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(null);
		list.add(12);
		list.add(78);
		list.add(34);
		list.add(04);
		list.add(15);
		list.removeLast();
		list.contains(list);
		list.remove(4);
		
		System.out.println(list);
		System.out.println("==============================================");
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Ram");
		list1.add("sham");
		list1.add("Yenkat");
		list1.add("Omkar");
		list1.add("Aryan");
		list1.add("Saurabh");
		list1.add("Rohit");
		
	   
		System.out.println(list1);
	}

}
