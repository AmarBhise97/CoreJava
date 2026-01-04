package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_1 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(12);
		tree.add(12);

		tree.add(7);
		tree.add(9);
		tree.add(6);
		tree.add(23);
		tree.add(1);
		tree.add(3);
		tree.add(19);
		System.out.println(tree);
		System.out.println(tree.size());

		System.out.println(tree.isEmpty());
		System.out.println(tree.first());
		System.out.println(tree.reversed());
		
		
		Iterator<Integer> it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
