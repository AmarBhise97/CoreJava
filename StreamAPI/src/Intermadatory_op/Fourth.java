package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;

public class Fourth {
public static void main(String[]args) {
	List <Integer> list = new ArrayList<>();
	list.add(234);
	list.add(458);
	list.add(108);
	list.add(234);
	list.add(256);
	list.add(265);
	list.add(105);
	
	
	list .stream().filter((i)->(i>200)).forEach((i)-> System.out.println(i*2));
}
}
