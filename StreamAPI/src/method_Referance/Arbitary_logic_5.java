package method_Referance;

import java.util.Arrays;
import java.util.List;

public class Arbitary_logic_5 {
	public static void main(String[]args) {
		//////Constructor////////////////////////////
		String st = new String("hello");
		List<String> list = Arrays.asList("abc","abcd","abcde");
		list.stream()
		.map(StringBuilder::new)
		.map(StringBuilder::reverse)
		.map(StringBuilder::toString)
		.map(String::toUpperCase)
		
		.map(st::concat)
		.forEach(System.out::println);
		
	}

}
