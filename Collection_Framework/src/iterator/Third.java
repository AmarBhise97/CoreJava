package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Third {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(new Book("A", i));
		}
		System.out.println(list);
		System.out.println(list.size());
		Iterator<Book> itr = list.iterator();
		while (itr.hasNext()) {

			Book book = itr.next();
			if (book.price > 10) {
				// itr.remove();
				System.out.println("a");

			} else {
				System.out.println("inIllegible");
			}
		}

	}
}

class Book {
	String name;
	int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;

	}

	public String toString() {
		return this.price + " ";
	}
}
