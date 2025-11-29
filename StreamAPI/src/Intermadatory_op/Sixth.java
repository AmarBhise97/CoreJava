package Intermadatory_op;

import java.util.List;
import java.util.Stack;

public class Sixth {
public static void main(String[]args) {
	List <String> list = new Stack<>();
	list.add("Murud");
	list.add("Latur");
	list.add("Wagholi");
	list.add("Wathwada");
	list.add("Wakdi");
	list.add("Manjri");
	
	list.stream().filter((i)->(i.startsWith("Wa"))).map(String::toUpperCase).forEach((i)-> System.out.println(i)); 	
}
}
