package Copiying;

public class DeapCopiynig_1 {
	public static void main(String[]args) {
		Company com = new Company("TCS");
		Employee emp = new Employee(12,"Amar",12000,com);
		Employee emp2 = new Employee(emp);
		
		emp.name="Aru";
		emp2.company.CompanyName="JPMORGan";
		
		System.out.println(emp);
		System.out.println(emp2);
		
	}

}
class Employee{
	int id;
	String name;
	double salary;
	Company company;
	public Employee(int id, String name, double salary, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	public Employee(Employee employee) {
		this.company=new Company(employee.company.CompanyName);
		this.id=employee.id;
		this.salary=employee.salary;
		this.name=employee.name;
		
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", company=" + company + "]";
	}
	
	
	
}

class Company{
	String CompanyName;

	public Company(String companyName) {
		super();
		CompanyName = companyName;
	}

	@Override
	public String toString() {
		return "Company [CompanyName=" + CompanyName + "]";
	}
	
}
