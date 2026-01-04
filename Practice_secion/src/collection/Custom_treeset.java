package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Custom_treeset {
	public static void main(String[] args) {
		TreeSet<Bike1> t1 = new TreeSet<>(new Numcompare());
		t1.add(new Bike1(12," aavasaki ","S!kd ",8888.6));
		t1.add(new Bike1(12," aavasaki ","Sk ",8888.6));
		t1.add(new Bike1(98," Kavasaki ","S!k ",8888.6));
		t1.add(new Bike1(34," cavasaki ","S!k ",8888.6));
		t1.add(new Bike1(23," Kavasaki ","S!k ",8888.6));
		t1.add(new Bike1(90," navasaki ","S!k ",8888.6));
		System.out.println(t1);
		
		Iterator<Bike1> b1 = t1.iterator();
		while(b1.hasNext()) {
			System.out.println(b1.next());
		}

	}

}

class Bike1 implements Comparable<Bike1> {
	int num;
	String name;
	String model;
	double price;

	public Bike1(int num, String name, String model, double price) {

		this.num = num;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	public String toString() {
		return this.num + this.name+this.model+this.price;
	}
	public int compareTo(Bike1 b1) {
		return (int) (this.model.compareTo(b1.model) + this.name.compareTo(name)  +this.num - b1.num + this.price-b1.price);
	}
	

}
class Numcompare implements Comparator<Bike1>{

	
	public int compare(Bike1 o1, Bike1 o2) {
		
		return Integer.compare(o2.num, o1.num);
	}
	
}
