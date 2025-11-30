package Intermadatory_op;

import java.util.HashSet;
import java.util.Set;

public class Seventh {
public static void main(String[]args) {
	Set<String> set = new HashSet<String>();
	set.add("413411");
	set.add("413410");
	set.add("309734");
	set.add("120004");
	set.add("795638"); 
	
	set.stream()
	.filter((i)->{return Integer
	.parseInt(i)>400000;})
	.forEach((i)->System.out.println(i.toUpperCase()));
}
}
