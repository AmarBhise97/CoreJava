package copying;

public class Referance_1 {
	public static void main(String[]args) {
		Student st = new Student(11,"Amar",150000.7);
		Student st1 =st;
		System.out.println(st);
		st1.name="Rutik";
		System.out.println(st1);
		System.out.println(st);//change the value for st and also st1.
	}

}
class Student{
	int id;
	String name;
	double price;
	
	
	public Student(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	public String toString() {
		return this.name+" " + this.id+"  "+price;
	}
	
}
