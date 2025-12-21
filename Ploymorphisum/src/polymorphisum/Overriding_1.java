package polymorphisum;



public class Overriding_1 {
	public static void main(String[] args) {
		// Person p1 = new Employee("Amar",19,001,12000.0f);
		Employee emp = new Employee("Amar", 19, 001, 1200.0f);
		emp.showRecord();
		// Employee ep =
		// (Employee)p1;/////////////////////downcasting//////////////////////

		// ep.showRecord();
		// System.out.println(ep.name="Amar");
		// System.out.println(ep.age=19);
		// System.out.println(ep.empid=12);
		// System.out.println(ep.salary=120000.0f);

	}

}

class Person {
	String name;
	int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void showRecord() {
		System.out.println("Name =" + name);
		System.out.println("Age=" + age);

	}
}

class Employee extends Person {
	int empid;
	float salary;

	public Employee() {

	}

	public Employee(String name, int age, int empid, float salary) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;

	}

	public void showRecord() {
		super.showRecord();///////////////////////// directly call super class method////////////
		System.out.println("Empid=" + empid);
		System.out.println("salary=" + salary);

	}
}
