package oops;

public class hiearchical_1 {
	public static void main(String[]args) {
		Student st = new Human(12,"Amar","Latur"); 
		st.printing();
		
		System.out.println("=======================================");
		Employee st1 = new Employee(13,"Amar",14,"Rutik","pune");
		st1.employeeRecords();
		//st1.printing();
		
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
		System.out.println("Student  Information....................");
		System.out.println("id : "+id);
		System.out.println("name  : "+name);
		System.out.println("city : "+city);
		
	}
	
}
class Employee  extends Student {
	int idd;
	String name1;
	public Employee(int idd, String name1,int id,String name,String city) {
		super(id,name,city);
		this.idd = idd;
		this.name = name1;
	}
	public void employeeRecords() {
		super. printing();
		System.out.println("Employee Information.........................");
		System.out.println("idd : "+idd);
		System.out.println("name : "+name);
	}
	
	
}
class Human extends Student{

	public Human(int id, String name, String city) {
		super(id, name, city);
		System.out.println("Human will printing...................");
	}
	
}


