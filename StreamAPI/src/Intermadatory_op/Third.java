package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;

public class Third {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(456);
		list.add(546);
		list.add(123);
		list.add(234);
		list.add(764);
		list.add(106);
		list
		.stream()
		
		.forEach((i) -> System.out.println(i * 2.5)
		);
	}
}
