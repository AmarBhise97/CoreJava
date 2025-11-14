package queue;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Queue;

public class Custome_queArray {
public static void main(String[]args) {
	Deque <Car> qu = new ArrayDeque<Car>();
	qu.add(new Car(101,"Swift      :"   ,  "Ao1",120000.60,"red"));
	qu.add(new Car(108,"Fortuner   :",     "Ao8",120000.60,"blue"));
	qu.add(new Car(103,"Definder   :",     "Ao4",120000.60,"black"));
	qu.add(new Car(100,"Mustang    : ",   "Ao9",120000.60,"white"));
	qu.add(new Car(109,"Lanburgini : ",    "Ao3",120000.60,"white"));
	for(Car i :qu) {
		System.out.println(i);
	}

}
}
class Car implements Comparable<Car>{
	int id;
	String name;
	String model;
	double price;
	String color;
	
	public Car(int id,String name,String model,double price,String color) {
		this.id=id;
		this.name=name;
		this.model=model;
		this.price=price;
		this.color=color;
		
	}
	
	
	public String toString() {
		return this.name+" / "+id +" / "+model+" / "+price+" / "+color;
	}


	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return o.id-this.id;
	}
	
}

	
