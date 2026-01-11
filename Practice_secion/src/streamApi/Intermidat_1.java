package streamApi;

import java.util.ArrayList;
import java.util.List;

public class Intermidat_1 {
	public static void main(String[]args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		list.stream()
		.forEach(i->System.out.println(i*30));
		
		System.out.println("========================================");
		
		list.stream().filter((i->(i>20))).forEach(i->System.out.print(i*2+" "));
	}

}
