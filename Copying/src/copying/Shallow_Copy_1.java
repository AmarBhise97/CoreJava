package copying;

public class Shallow_Copy_1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1=new Employee(22,"amar","pune");
		Employee emp2=(Employee)emp1.clone();
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println("==============================================");
		emp1.id=44;
		emp2.id=56;
		System.out.println(emp1);
		System.out.println(emp2);

	}

}

class Employee {
	int id;
	String name;
	String city;

	public Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;

	}

	public Object clone() throws CloneNotSupportedException {

		int id = this.id;
		String name = this.name;
		String city = this.city;
		Employee emp = new Employee(id, name, city);
		//return id+name+city;//class castException thrown
		return emp;
		
		
		/**
		*  return super.clone();  CloneNotSupportedException can throw because its a native method
		 **/
		

	}
	public String toString() {
		return this.id+" "+ this.name+" "+ this.city;
	}
}
