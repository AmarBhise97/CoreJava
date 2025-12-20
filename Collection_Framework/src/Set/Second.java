package Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Second {
	public static void main(String[] args) {
		Set<Bike> set = new HashSet<Bike>();
		Bike bike = new Bike(12, " Dueak ", 90000);
		Bike bike1 = new Bike(12, " Dueak ", 90000);
		Bike bike2 = new Bike(12, " Dueak ", 90000);
         set.add(bike);
         set.add(bike1);
         set.add(bike2);
         System.out.println(set);

	}
}

class Bike {
	int id;
	String name;
	double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Bike(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int hashCode() {
		System.out.println("Hashset is using the hashcode");
		return Objects.hash(this.id, this.name, this.price);

	}

	public boolean equals(Object o) {
		System.out.println("using .equals");
		Bike b1 = (Bike) o;

		return (this.id == b1.id && this.name.equals(b1.id) && this.price == b1.price);
	}
	public String toString() {
		return "Bike"+this.id+this.name+this.price;
	}
}