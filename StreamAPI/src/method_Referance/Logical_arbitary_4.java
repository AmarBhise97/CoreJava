package method_Referance;

import java.util.Arrays;
import java.util.List;

public class Logical_arbitary_4 {
	public static void main(String[]args) {
		List<String> list =Arrays.asList("1222","144","256","16");
		List<Integer>list2=List.of(12,2334,34547,454678,325475);
		
		
		list.stream()
		.map(String::length)
		.map(Math::sqrt)
		.forEach(System.out::println);
		
		System.out.println("=================================================");
		
		list.stream()
		.map(Integer::parseInt)
		.map(Math::sqrt)
		.forEach(System.out::println);

   }
}