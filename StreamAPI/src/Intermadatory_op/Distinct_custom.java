package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Distinct_custom {
public static void main(String[]args) {
	
	Mobile mob=new Mobile(1200.5,"Micromax");
	Mobile mob1=new Mobile(1200.5,"Micromax");
	Mobile mob2=new Mobile(1200.5,"Micromax");
	Mobile mob3=new Mobile(1200.5,"Micromax");
	List<Mobile> list = new ArrayList<Mobile >();
	list.add(mob);
	list.add(mob1);
	list.add(mob2);
	list.add(mob3);
	list.stream().distinct().forEach((i)->{System.out.println(i);});
}
}
class Mobile {
	double Price ;
	String Model;
	
	public Mobile(double Price , String Model ) {
		this.Price = Price;
		this.Model = Model;
	}
	
	public int hashCode() {
		return Objects.hash(this.Model,this.Price);
	}
	public boolean equals(Object obj) {
		Mobile mob = (Mobile)obj;
		return this.Price==mob.Price&&this.Model.equals(mob.Model);
	}
	public String ToString() {
		return this.Model;
	}
}