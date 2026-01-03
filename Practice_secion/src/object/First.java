package object;

public class First {
	public static void main(String[] args) {
		Bike b1 = new Bike(1,"Amar","Pune");
		Bike b2 = new Bike(2,"Amar","Pune");
		
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		

	}

}

class Bike {
	int id;
	String name;
	String city;

	public Bike(int id, String name, String city) {
		this.name = name;
		this.id = id;
		this.city = city;

	}
	public String toString() {
		return this.id+" " + this.name + " "+ this.city;
	}
	
	
	public int hashCode() {
		 return this.id;
	}
	public boolean equals(Object o) {
		Bike b1 = (Bike)o;
		return  this.id==b1.id && this.name.equals(b1.name)&& this.city.equals(b1.city) ;
	}
	
	
}
