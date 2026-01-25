package streamApitwo;

import java.util.Arrays;
import java.util.List;

public class Construrefer {
	public static void main(String[]args) {
		List<String> li = Arrays.asList("Ankit","rwrdg","srgh","sdfgh");
		li.stream()
		.map(String::toUpperCase)
		.map(StringBuffer::new)
		.filter(i->i.length()>4)
		.map(StringBuffer::reverse)
		
		
		
		.forEach(System.out::println);
	}

}
class Pen{
	
	
}
