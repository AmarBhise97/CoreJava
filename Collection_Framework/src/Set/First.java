package Set;

import java.util.HashSet;
import java.util.Set;

public class First {
public static void main(String[]args) {
	Set<Integer> set=new HashSet<Integer>();
	set.add(1);
	set.add(23);
	set.add(1);
	set.add(34);
	set.add(null);
	set.add(null);
	//set.add("ad");
	System.out.println(set);
}
}
