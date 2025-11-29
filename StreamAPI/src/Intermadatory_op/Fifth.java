package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Fifth {
public static void main(String[]args) {
	List <Integer> list =new ArrayList<>();
	Consumer <Integer> cons =((i)->  System.out.println(i*4));
	Predicate <Integer> pred=(i)-> {return i>10;};
     
	list.add(12);
	list.add(32);
	list.add(06);
	list.add(02);
	list.add(34);
	list.add(19);
	
	
	list.stream().filter(pred).forEach((i)->System.out.println(i));
}
}
