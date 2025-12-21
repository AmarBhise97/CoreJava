package polymorphisum;



public class Overriding_3 {
	public static void main(String [] args) {
		//Person p1 = new Employee("Amar",19,001,12000.0f);
		//Employee emp=new Employee("Amar",19,001,1200.0f);
		//emp.showRecord();
		
		Employee2 emp1=new Employee2();
		emp1.showRecord();
		System.out.println();
		Person2 p1=new Employee2();
		p1.showRecord();
		
	}

}
class Person2{
	String name;
	int age;
	public Person2() {
		System.out.println("Amar.Person");
	}
	public Person2(String name,int age) {
		this . name=name;
		this .age =age;
		
		
	}
	public void showRecord() {
		System.out.println("Name ="+name);
		System.out.println("Age="+age);
		
	}
}
class Employee2 extends Person2{
	int empid;
	float salary;
	
	public Employee2() {
		System.out.println("Employee.p");
		
	}
	public Employee2(String name ,int age,int empid,float salary) {
		super( name,age);
		this.empid=empid;
		this.salary=salary;
		
	}
	public void showRecord() {
		//Day_21_2 OverridingDay_21_2 Overridingsuper.showRecord();/////////////////////////directly call super class method////////////
		System.out.println("Empid="+empid);
		System.out.println("salary="+salary);
		
	}
}
