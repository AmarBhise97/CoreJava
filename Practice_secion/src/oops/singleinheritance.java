package oops;

public class singleinheritance {
	public static void main(String[]args) {
		second se = new second();
		
		second se2 = new second(12,"Amar","pune", 13,"Omkar","pune");
		se2.pt();
		se2.print();
	}

}
class First{
	int id ;
	String name;
	String city;
	
	public First() {
		System.out.println("First class...... ");
		
	}
	public First(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	public void print() {
		System.out.println("id : "+id + "  name : "+name +" city : "+city);
	}
}
class second extends First{
	int id2;
	String name2;
	String city2;
	
	public second() {
		System.out.println("Second class.....................");
		
	}
	public second(int id2,String name2,String city2,int id, String name, String city) {
		super(id,name,city);
		this.id2=id2;
		this.name2=name2;
		this.city2=city2;
	}
	public void pt() {
		System.out.println("id2 : "+id2 + "  name2 : "+name2 +" city2 : "+city2);
		
	}
	
}
