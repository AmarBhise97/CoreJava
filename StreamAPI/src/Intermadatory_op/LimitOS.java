package Intermadatory_op;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LimitOS {
   public static void main(String[]args) {
	   
	   List<Integer> list = new ArrayList<Integer>();
	   
	   list.add(12);
	   list.add(45);
	   list.add(23);
	   list.add(9);
	   list.add(8);
	   list.add(07);
	   list.add(56);
	   list.add(22);
	   list.add(78);
	   
	   System.out.println("List :: "+list);
	   
	   list.stream().sorted().skip(1).limit(2).forEach((i)->{System.out.println(i);});
	   
	   
	   System.out.println("=============================================");
	   
	   list.stream().sorted(new Comparisum()).skip(1).limit(2).forEach((i)->{System.out.println(i);});
   }
}
class Comparisum implements Comparator<Integer>{
	public int  compare(Integer o1 , Integer o2) {
		return o2.compareTo(o1);
	}

	
}
