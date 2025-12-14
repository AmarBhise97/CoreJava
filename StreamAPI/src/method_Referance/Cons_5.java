package method_Referance;

import java.util.Arrays;
import java.util.List;

public class Cons_5 {
	public static void main(String[]args) {
		List<String> list=Arrays.asList("Latur","Pune","Kolhapur","Shikrapur","Mahabaleshwer");
		list.stream().filter(Cheaker::check)
		.peek(System.out::println)
		.map(StringBuilder::new)
		.map(StringBuilder::reverse)
		.map(StringBuilder::toString)
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}

}
class Cheaker{
	
	public static boolean check(String s) {
		return s.charAt(0)>79;
	}
}
