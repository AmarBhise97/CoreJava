package equals;

import java.util.Objects;

public class Demo1 {
public static void main(String[]args) {
	Bike b1=new Bike();
	b1.name="Kavasaki";
	b1.average=100;
	b1.maxspeed=200;
	b1.color="Black";
	System.out.println(b1.hashCode());
	
	Bike b2=new Bike();
	b2.name="Kavasaki";
	b2.average=100;
	b2.maxspeed=200;
	b2.color="Black";
	System.out.println(b2.hashCode());
	System.out.println(b1.equals(b2));
	System.out.println("kavasaki".equals(null));
}
}
class Bike{
	String name;
	int average;
	int maxspeed;
	String color;
	public boolean equals(Object object) {
		if(object==null) {
			return false;
		}
			Bike b1=(Bike)object;
			return this.name.equals(b1.name) && this.average==b1.average && this.maxspeed==b1.maxspeed && this.color.equals(b1.color);
		
		
	}
	public int hashCode() {
		return Objects.hash(name,average,maxspeed,color);
	}
}