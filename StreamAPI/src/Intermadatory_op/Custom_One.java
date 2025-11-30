package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Custom_One {
public static void main(String[]args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	
	List<Integer> list2 = new ArrayList<Integer>();
	list2.add(40);
	list2.add(50);
	
	List<Integer> list3 = new ArrayList<Integer>();
	list3.add(70);
	list3.add(80);
	
	List<List<Integer>> list4 = new ArrayList<List<Integer>>();
	list4.add(list);
	list4.add(list2);
	list4.add(list3);
	
	
	list4.stream().forEach((i)->{i.stream().forEach((j)-> {System.out.println(j*2);});});
	
	System.out.println("=======================");
	list4.stream().forEach(new Two_D());

	
}
}
class Two_D implements Consumer<List<Integer>>{
	public void accept(List<Integer> i) {
		 i.stream().forEach(new One_D());
		 
		
	}

	
}
class One_D implements Consumer<Integer>{
	public void accept(Integer i) {
		System.out.println(i*2);
	}
	
}
