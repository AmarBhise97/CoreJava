package First_Mock;

import java.util.Collections;
import java.util.List;

public class Uniqueele_Stream {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 5, 5, 9, 5, 2, 2, 0, 4, 9);

		int sum = list.stream()
				.filter(i -> Collections.frequency(list, i) == 2)
				.peek(i -> System.out.println(i))
				.reduce(0, (i, j) -> i + j);
		         System.out.println(sum);
	}

}
