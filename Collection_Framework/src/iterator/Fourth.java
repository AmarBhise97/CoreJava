package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Fourth {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		ListIterator<Integer> li = list.listIterator();
		while (li.hasNext()) {

			if (li.next() == 5) {
				li.remove();
			} else {
				System.out.println(li.next());
			}
		}
		System.out.println(list);

	}
}