package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Third_map {
	public static void main(String[]args) {
		
		Predicate <Integer> pre = (i)->(i>=20);
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(50);
		list.add(10);
		System.out.println(list);
		
		list.stream().filter(i->i>50)
		.map(i->i.doubleValue())
		.map(i->i.floatValue())
		.map(i->i.getClass())
		
		.forEach(System.out::println);
}
}
