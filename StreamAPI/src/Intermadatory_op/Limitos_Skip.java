package Intermadatory_op;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Limitos_Skip {
	public static void main(String[]args) {
		List <Emp> list = new ArrayList<Emp>();
		list.add(new Emp("Amar",12005));
		list.add(new Emp("Amar",12005));
		list.add(new Emp("keshav",12005));
		list.add(new Emp("rushi",12005));
		list.stream().distinct().sorted(new Comparing1()).limit(2).skip(1).forEach((i)->{System.out.println(i);});
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
class Comparing1 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1,o2);
	}
	
}