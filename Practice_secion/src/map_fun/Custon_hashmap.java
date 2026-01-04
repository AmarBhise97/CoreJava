package map_fun;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

public class Custon_hashmap {
	public static void main(String[]args) {
		Hashmp hp = new Hashmp(12," Amar ","City");
		Hashmp hp1 = new Hashmp(19," Autik ","City");
		Hashmp hp2= new Hashmp(6," Auraj ","City");
		Hashmp hp3 = new Hashmp(4," AA ","City");
		Hashmp hp4 = new Hashmp(34," Nikhil ","City");
		Hashmp hp5 = new Hashmp(0," Chandu ","City");
		System.out.println(hp.hashCode());
		System.out.println(hp1.hashCode());
		System.out.println(hp2.hashCode());
		System.out.println(hp3.hashCode());
		System.out.println(hp4.hashCode());
		System.out.println(hp5.hashCode());
		HashMap<Hashmp,Integer> h1 = new HashMap<>();
		h1.put(hp, 1);
		h1.put(hp1, 3);
		h1.put(hp2, 7);
		h1.put(hp3, 9);
		h1.put(hp4, 6);
		h1.put(hp5, 14);
		System.out.println(h1);
		for(Entry<Hashmp,Integer> e :h1.entrySet()) {
			System.out.println(e.getKey()+" = "+e.getValue());
			System.out.println();
		}
		
	}

}
class Hashmp{
	int id;
	String name;
	String city;
	public Hashmp(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public String toString() {
		return this.id + this.name +this.city;
	}
	
	public int hashCode() {
		return Objects.hash(id,name,city);
	}
	public boolean equals(Object o) {
		Hashmp h = (Hashmp)o;
		return this.id == h.id && this.name.equals(h.name) && this.city.equals(h.city);
	}
}
