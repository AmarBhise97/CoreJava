package oops;

public class hiearchical_1 {
	public static void main(String[]args) {
//		Student st = new Human(12,"Amar","Latur"); 
//		st.printing();
		
		Employee ep = new Human(13,"ankit");
		ep.employeeRecords();
		
	}

}
class Student{
	int id;
	String name;
	String city;
	public Student(int id, String name, String city) {
		
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public void printing() {
		System.out.println("Student Information....................");
		System.out.println("id : "+id);
		System.out.println("name  : "+name);
		System.out.println("city : "+city);
		
	}
	
}
class Employee {
	int idd;
	String name;
	public Employee(int idd, String name) {
		
		this.idd = idd;
		this.name = name;
	}
	public void employeeRecords() {
		System.out.println("Employee Information.........................");
		System.out.println("idd : "+idd);
		System.out.println("name : "+name);
	}
	
	
}
class Human extends Employee{

	public Human(int idd, String name) {
		super(idd, name);
		System.out.println("Human will printing...................");
	}
	
}


