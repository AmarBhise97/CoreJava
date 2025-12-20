package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Second_Li {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i);/// ListIterator is only use in List interface.
		}
		ListIterator<Integer> li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			//System.out.println("Li");
		}
	}
}
