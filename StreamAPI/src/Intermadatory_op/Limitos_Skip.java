package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Limitos_Skip {
	public static void main(String[]args) {
		List <Emp> list = new ArrayList<Emp>();
		list.add(new Emp("Amar",12005.0));
		list.add(new Emp("Amar",12005.0));
		list.add(new Emp("keshav",12005.0));
		list.add(new Emp("rushi",12005.0));
		list.stream().distinct().sorted().forEach((i)->{System.out.println(i);});
	}

}
class Emp implements Comparable<Emp>{
 	


	String name;
	double price;
	
	public Emp(String name,double price) {
		this.name=name;
		this.price=price;
		
	}
	public int hashCode() {
		System.out.println("A");
		return Objects.hash(this.name);
	}
	public boolean equals(Object obj) {
		Emp ep = (Emp)obj;
		return this.name .equals(ep.name)+" "+ this.price == ep.price +" ";
		
	}
	public String toString() {
		return name + price;
	}
	public int compareTo(Emp e){
		return e.name.compareTo(this.name) ;
	}
}