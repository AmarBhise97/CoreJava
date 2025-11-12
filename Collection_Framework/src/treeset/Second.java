package treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Second {
	public static void main(String[] args) {
		SortedSet<Bike> bike = new TreeSet<Bike>(new RatingComparator());
		bike.add(new Bike(1, "a.kavasaki", 5.5, 20000, new int[] { 1, 2, 3 }));
		bike.add(new Bike(2, "b.ninja", 9.9, 60000, new int[] { 1, 2, 3, 4 }));
		System.out.println(bike);
	}
}

class Bike implements Comparable<Bike> {
	int id;
	String name;
	double rating;
	double price;
	int[] servasing;

	public Bike(int id, String name, double price, double rating, int[] servasing) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.servasing = servasing;

	}

	public String toString() {
		// return this.name;
		return this.id + " ";
	}

	public int hashCode() {
		return 100;

	}

	public boolean equals(Object o) {
		return true;

	}

	@Override
	public int compareTo(Bike o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}

class PriceComparator implements Comparator<Bike> {

	@Override
	public int compare(Bike o1, Bike o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.price, o1.price);
	}

}

class IDComparator implements Comparator<Bike> {

	@Override
	public int compare(Bike o1, Bike o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.id, o2.id);
	}

}
class RatingComparator implements Comparator<Bike>{
	public int compare(Bike o1,Bike o5) {
		return Double.compare(o5.rating,o1.rating);
	}
}