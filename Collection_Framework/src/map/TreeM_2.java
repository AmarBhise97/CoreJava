package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeM_2 {
public static void main(String[]args) {
	TreeMap<Collage,Integer> collage = new TreeMap<Collage,Integer>(new idComparator());
	collage.put(new Collage(1,")Ankit ::",80), 2);
	collage.put(new Collage(2,")suresh ::",88), 8);
	collage.put(new Collage(3,")gagan ::",81), 9);
	collage.put(new Collage(7,")luky  ::",89), 4);
	collage.put(new Collage(5,")suresha  ::",79), 7);
	/**
	 * we can use multiple null value but can not use null key
	 * because it problem for sorting 
	 */
	System.out.println(collage);
	

}
}
class Collage implements Comparable<Collage>{
	int id;
	String name;
	double marks;
	
	public Collage(int id,String name,double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return this.id+this.name+ this.marks;
	}
	
	
	
	public int compareTo(Collage o) {
		
		return o.id- this.id;
	}
}
class idComparator implements Comparator<Collage>{


	public int compare(Collage o1, Collage o2) {
		
		return Integer.compare(o1.id, o2.id);
	}
	
}

