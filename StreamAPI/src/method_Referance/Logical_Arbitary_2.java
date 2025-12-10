package method_Referance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Logical_Arbitary_2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "abcd", "abcde");
		list.stream().map(String::length)
		.map(Suspence::square)
		.forEach(System.out::println);
		
		System.out.println("================================");
		
		List<Integer>list1=Arrays.asList(16,121,144,256);
		list1.stream().map(Math::sqrt).forEach(System.out::println);;
		
		
		

	}

}

class Suspence {
	public static int square(int i) {
		return i * i;
	}
}
