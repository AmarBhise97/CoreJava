package streamApitwo;

import java.util.Arrays;
import java.util.List;

public class Arbitary {
	public static void main(String[]args) {
		List<Book> li = Arrays.asList(new Book(2,2.2,"Amar")
				,new Book(1,2.3,"KKKR")
				,new Book(3,3.5,"ddd")
				,new Book(7,8.0,"srgt"));
		li.stream().map(i->i.getClass()).forEach(System.out::println);
		
		li.stream().map(i->i.rating).forEach(System.out::println);
		
		
	}

}
class Book{
	int id;
	double rating;
	String name;
	public Book(int id, double rating, String name) {
		
		this.id = id;
		this.rating = rating;
		this.name = name;
	}
	public String toString() {
		return this.id+" "+ this.rating+ this.name;
	}
	
}