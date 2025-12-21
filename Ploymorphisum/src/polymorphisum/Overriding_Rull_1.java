package polymorphisum;



public class Overriding_Rull_1 {
public static void main(String [] args) {
		
		Person1 p1=new Employe();
		Employe emp=(Employe)p1;
		//emp. f1();
		emp.f2();
	}
	

}
class Person1{
	protected Number f1() {
		System.out.println("Person");
		return 100;
		//System.out.println(return);
		
	}
	
}
class Employe extends Person1{
	protected Number f2() {
		super.f1();
		System.out.println("Employee");
		return 50;
	}
}
