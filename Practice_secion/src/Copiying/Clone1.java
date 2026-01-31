package Copiying;

public class Clone1 {
public static void main(String[]args) {
	Student3 std1 = new Student3(12,"Amar");
//	Student3  std2=std1;
//	
//	System.out.println(std1.hashCode());
//	System.out.println(std2.hashCode());
//		
	
	Student3 std3 = (Student3)std1.clone();
	
	std1.id=24;
	std3.name="A";
	System.out.println(std1);
	System.out.println(std3);
	
	System.out.println(std1.hashCode());
	System.out.println(std3.hashCode());
	}

}
class Student3 implements Cloneable{
	
	int id;
	String name;
	public Student3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Object clone() {
		int id=this.id;
		String name=this.name;
		Student3 std = new Student3(id,name);
		
		return std;
		
		
	}
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + "]";
	}
	

}
