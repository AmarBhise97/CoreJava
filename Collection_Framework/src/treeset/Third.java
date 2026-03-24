package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Third {
	public static void main(String[]args) {
		
		TreeSet<Car> tree = new TreeSet<Car>(new idCompara ());
		
		Car car = new Car(1,"Amar","pune",12.2);
		Car car1 = new Car(1,"Ankit","kolkata",89.2);
		Car car2 = new Car(3,"Gagan","Surat",67.2);
		Car car3 = new Car(4,"Vivek","Latur",56.2);
		tree.add(car);
		tree.add(car1);
		tree.add(car2);
		tree.add(car3);
		
		
		System.out.println(tree);
		
	}
	

}

class Car implements Comparable<Car>{
	int id;
	String name;
	String address;
	double price;
	public Car(int id, String name, String address, double price) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", address=" + address + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Car o) {
	
		return this.id-o.id;
	}
}
	
class idCompara implements Comparator<Car>{

		
		public int compare(Car o1, Car o2) {
			
			
			return Integer.compare(o2.id,o1.id ) ;
		}
		
	}
	
	
	
	
	
	
	
	
	

