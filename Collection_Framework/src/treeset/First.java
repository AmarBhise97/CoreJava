package treeset;

import java.util.Set;
import java.util.TreeSet;

public class First {
public static void main(String[]args) {
	Set<Book> set = new TreeSet<Book>();
	set.add(new Book(1,"Kd",1600.80));
	set.add(new Book(1,"K5",1300.70));
	System.out.println(set);
}
}
class Book implements Comparable<Book>{
	int id;
	String name;
	double price;
	
	
	public Book(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
	public int compareTo(Book o) {
		
		return this.id-o.id;
	}
	public String toString() {
		return this.name +" ";
	}
	
	
}