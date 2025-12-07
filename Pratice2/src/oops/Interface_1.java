package oops;

public class Interface_1 {
	public static void main(String[]args) {
		Cow an = new Cow(null, 0);
		
		
	}

}
class Animal1{
	String name;
	double weight;
	public Animal1(String name,double weight) {
		this.name=name;
		this.weight=weight;
		System.out.println("ak");
		
	}
	
	 
}
class Cow extends Animal1{
	String name;
	double weight;
	
	public Cow(String name,double weight) {
		super(name,weight);
		this.name=name;
		this.weight=weight;
		System.out.println("bk");
	}
}
