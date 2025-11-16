package iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class First {
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i);////// Iterator works in all classes in collection
		}
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main2(String[] args) {
		Queue<Integer> qu = new PriorityQueue<>();
		for (int i = 0; i < 100; i++) {
			qu.add(i);
		}
		Iterator<Integer> itr = qu.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("Q");
		}
	}

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 100; i++) {
			set.add(i);

		}
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
