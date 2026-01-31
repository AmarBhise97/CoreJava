package Copiying;

public class Constructorref {
	public static void main(String[] args) {
		Student2 std = new Student2(1, "Amar", 88.60);
		Student2 std2 = new Student2(std);

		System.out.println(std.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(std);
		System.out.println(std2);
		
		std.id=12;
		std2.name="Arute";
		System.out.println(std);//only change a spacific fields not change whole object.copy only fields not whole object
		System.out.println(std2);

	}

}

class Student2 {
	int id;
	String name;;
	double marks;

	public Student2(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student2(Student2 stdu) {
		this.id = stdu.id;
		this.name = stdu.name;
		this.marks = stdu.marks;

	}

	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}