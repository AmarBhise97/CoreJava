package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Custom_linked {
	public static void main(String[] args) {
		
		Car c1 = new Car(12,"BB45 ","Desel ",66000.0);
		Car c2 = new Car(12,"BB45 ","Desel ",66000.0);
		Car c3 = new Car(14,"BB45 ","Desel ",66000.0);
		Car c4 = new Car(17,"BB45 ","Desel ",66000.0);
		Car c5 = new Car(18,"BB45 ","Desel ",66000.0);
		Car c6 = new Car(19,"BB45 ","Desel ",66000.0);
		Car c7 = new Car(90,"BB45 ","Desel ",66000.0);
	
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c5.hashCode());
		System.out.println(c6.hashCode());
		System.out.println(c7.hashCode());
		System.out.println(c1.equals(c3));
		LinkedHashSet<Car> lik = new LinkedHashSet<>();
		
		lik.add(c1);
		lik.add(c2);
		lik.add(c3);
		lik.add(c4);
		lik.add(c5);
		lik.add(c6);
		
		lik.add(c7);
		System.out.println(lik);
		System.out.println("======================================");
		Iterator<Car> it = lik.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Car {
	int id;
	String model;
	String fuealtype;
	double price;

	public Car(int id, String model, String fuealtype, double price) {

		this.id = id;
		this.model = model;
		this.fuealtype = fuealtype;
		this.price = price;
	}

	public String toString() {
		return this.id + " " + this.model + this.fuealtype + this.price;
	}

	public int hashCode() {
		return Objects.hash(id, model, fuealtype, price);
	}

	public boolean equals(Object obj) {
		Car c1 = (Car) obj;
		return this.id == c1.id && this.model.equals(c1.model) && this.fuealtype.equals(c1.fuealtype)
				&& this.price == c1.price;
	}

}
