package First_Mock;

import java.util.List;
import java.util.stream.Stream;

public class ConcatTwo_lists {
	public static void main(String[]args) {
		List<Integer> list = List.of(1,2,3,4,5,6);
		List<Integer> list1 = List.of(1,9,3,0,7,6);
		
		List<Integer>list3 = Stream.concat(list.stream(), list1.stream())
				.distinct()
				.toList();
		System.out.println(list3);
	}

}
