package basics;

public class Static_1 {
	public static void main(String[] args) {
		Student st = new Student(12, "Amar");
		st.pritre();
		st.p1();
		
		Student st1= new Student(150,"viky");
		st1.pritre();
		st1.p1();

	}

}

class Student {
	int id;
	String name;
	public static int id2;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public void pritre() {
		System.out.println("Id : " + id);

	}

	public static void p1() {
		System.out.println("yes i am amar...............");
	}

	static {
		id2 = 11500;
		System.out.println("I am working properly..................");
	}

}
