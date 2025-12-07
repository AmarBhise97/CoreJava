package oops;

public class Inheri_1 {
	public static void main(String[]args) {
		Overview ov =new Overview("Amar",12,3066f);
		
		
	}

}
class Employee{
	String name;
	int id;
	float salary;
	public Employee(String name, int id, float salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
		System.out.println(name+" : name");
		System.out.println(id+  " : id");
		System.out.println(salary+" : slary");
	}
	
	

	
}
class Empoverview extends Employee{
	public Empoverview(String name, int id, float salary) {
		super(name, id, salary);
		this.name=name;
		this.id=id;
		
			System.out.println(name+" : name");
			System.out.println(id+  " : id");
			System.out.println(salary+" : slary");
		
		
	}
	String name;
	int id;
	float salary;
	
	
	
}
class Overview extends Empoverview{
	
	public Overview(String name, int id, float salary) {
		super(name, id, salary);
		this.name=name;
		this.id=id;
		this.salary=salary;
		System.out.println(name+" : name");
		System.out.println(id+  " : id");
		System.out.println(salary+" : slary");
		
		
	}
	String n;
	int idd;
	float salary;
	
}
