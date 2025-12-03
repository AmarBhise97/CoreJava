package Intermadatory_op;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logic_1 {
public static void main(String[]args) {
	List<String> list = new ArrayList<String>();
	list.add("Marigold");
	list.add("Parly_g");
	list.add("T20-T20");
	list.add("Gooday");
	list.add("Britinya");
	list.add("Borbon");
	list.add("Tiger");
	list.add("Marigold");
	list.add("Biscut");
	list.add("Bust");
	System.out.println(list);
	list.stream()
	.map((i)->{return i.toUpperCase();})
	.filter((i)->{return i.startsWith("B");})
	.map((i)->{return i.length();})
	.sorted()
	.distinct()
	.forEach((i)->{System.out.println(i);});
	
	System.out.println("==========================================================");
	
	list.stream()
	.map((i)->{return i.toUpperCase();})
	.filter((i)->{return i.startsWith("B");})
	.map((i)->{return i.length();})
	.sorted(new CompareBiscut())
	.distinct()
	.forEach((i)->{System.out.println(i);});
}
}
class CompareBiscut implements Comparator<Integer>{
	public int compare(Integer o1,Integer o2) {
		return Integer.compare(o2,o1);
	}

	
}

	
