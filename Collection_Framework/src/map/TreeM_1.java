package map;

import java.util.TreeMap;

public class TreeM_1 {
public static void main(String[]args) {
	TreeMap<School1,Integer> tm = new TreeMap<School1,Integer>();
	tm.put(new School1(1,") Amar :: ",88.60), 1);
	tm.put(new School1(8,") Tushar :: ",89.70), 2);
	tm.put(new School1(2,") Aryan :: ",99.60), 4);
	tm.put(new School1(5,") Vivek :: ",60.80), 8);
	System.out.println(tm);
}
}
class School1 implements Comparable<School1>{
	int id;
	String name;
	double marks;
	
	public School1(int id,String name,double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return this.id+this.name+ this.marks;
	}
	
	
	
	public int compareTo(School1 o) {
		
		return this.id-o.id;
	}
	
}
