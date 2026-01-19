package Function;

import java.util.Arrays;
import java.util.List;

public class Logical_1 {
	public static void main(String[]args) {
		List<String> list = Arrays.asList("Aeou","Eadt","Esfe0","Iot","ght","kmn");
		Integer Square=list.stream().filter(De::check)
				.map(StringBuffer::new)
				.peek(System.out::println)
				.map(StringBuffer::reverse)
				.peek((i)->System.out.println(i.length()))
			    .map(StringBuffer::toString)
			    .map(String::length)
				.reduce(0,(i,j)->(0+(j+j)));
		         System.out.println(Square);
		
	}

}
class De{
	public static boolean check(String s) {
		return s.startsWith("A")|| s.startsWith("E")||s.startsWith("I");
	}
}
