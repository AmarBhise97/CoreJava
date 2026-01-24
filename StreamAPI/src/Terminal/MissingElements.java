package Terminal;

import java.util.List;
import java.util.stream.IntStream;

public class MissingElements {
	public static void main(String[]args) {
		List<Integer>list =List.of(2,5,7,9,5);
		IntStream.rangeClosed(2, 9).forEach((i)->{
			if(!list.contains(i)) {
				System.out.println(i);
			}
		});
	}

}
