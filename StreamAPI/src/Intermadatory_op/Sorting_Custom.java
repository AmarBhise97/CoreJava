package Intermadatory_op;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

public class Sorting_Custom {
	public static void main(String[] args) {
		
		//Deque  ==> LIFO
		//queue ==> FIFO
		
		Deque <Plant> plant = new ArrayDeque<Plant>();
		plant.add(new Plant (1900.5,"Mango"));
		plant.add(new Plant (1700.5,"Papaya"));
		plant.add(new Plant (1200.5,"Chiya"));
		plant.add(new Plant (1600.5,"Stobary"));
		
		plant.stream().sorted().forEach((i)->{System.out.println(i);});
		System.out.println("==========================================");
		plant.stream().sorted(new TreeComparator()).forEach((i)-> {System.out.println(i);});
		

	}
}
class Plant implements Comparable<Plant>
{
	double price;
	String name;
	
	public Plant(double price,String name) {
		this.price=price;
		this.name=name;
		
	}
	public String toString() {
		return this.name+this.price+" ";
	}
	
	public int compareTo(Plant o) {
		
		return Double .compare(this.price, o.price);
	}
	
}
class TreeComparator implements Comparator<Plant>{
	public int compare(Plant o1,Plant o2) {
		return Integer.compare(o2.name.length(), o1.name.length());
	}
}