package Intermadatory_op;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Limitos_Skip {
	public static void main(String[]args) {
		List <Emp> list = new ArrayList<Emp>();
		list.add(new Emp("Amar",12009));
		list.add(new Emp("Amar",12009));
		list.add(new Emp("keshav",1200));
		list.add(new Emp("rushi",12006));
		list.stream().sorted(new Comparing1()).distinct().forEach((i)->{System.out.println(i);});
	}

}
class Emp implements Comparable<Emp>{
 	


	String name;
	int price;
	
	public Emp(String name,int price) {
		this.name=name;
		this.price=price;
		
	}
	public int hashCode() {
		
		return Objects.hash(this.name);
	}
	public boolean equals(Object obj) {
		Emp ep = (Emp)obj;
		return this.name .equals(ep.name);
		
	}
	public String toString() {
		return name + price;
	}
	public int compareTo(Emp e){
		return e.name.compareTo(this.name) ;
	}
	
}
class Comparing1 implements Comparator<Emp>{

	


	public int compare(Emp o1, Emp o2) {
	
		return Integer.compare(o2.price, o1.price);
	}}