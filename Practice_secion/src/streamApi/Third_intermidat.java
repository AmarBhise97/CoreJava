package streamApi;

import java.util.ArrayList;
import java.util.List;

public class Third_intermidat {
	public static void main(String[]args) {
		List<String> list=new ArrayList<>();
		list.add("Ac");
		list.add("Amar");
		list.add("Ar");
		list.add("Rushoi");
		list.add("Ac");
		
		list.stream().sorted().filter(i->(i.startsWith("A"))).limit(2).distinct().skip(0).map(String::toUpperCase)
		.map(StringBuffer::new).map(StringBuffer::reverse)
		.forEach(System.out::println);
		
		
	}

}
