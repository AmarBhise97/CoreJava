package map_fun;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CustomTreemp {
	public static void main(String[]args) {
		TreeMap<DeadLine,Integer> mp = new TreeMap<>(new Idcompare());
		mp.put(new DeadLine(5,"Amar ","Latur"), 12);
		mp.put(new DeadLine(1,"Amar ","Latur"), 14);
		mp.put(new DeadLine(8,"Amar ","Latur"), 19);
		mp.put(new DeadLine(6,"Amar ","Latur"), 6);
		
		System.out.println(mp);
		for(Entry<DeadLine,Integer> r :mp.entrySet()) {
			System.out.println(r.getKey()+" = "+r.getValue());
		}
	}

}
class DeadLine implements Comparable<DeadLine>{
	int id;
	String name;
	String address;
	public DeadLine(int id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String toString() {
		return this.id +" "+ this.name + this.address;
	}
	public int compareTo(DeadLine d) {
		return this.id- d.id + this.name.compareTo(d.name)+ this.address.compareTo(d.address);
		
	}
	
	
	
}
class Idcompare implements Comparator<DeadLine>{


	public int compare(DeadLine o1, DeadLine o2) {
		
		return Integer.compare(o2.id, o1.id);
	}
	
}
