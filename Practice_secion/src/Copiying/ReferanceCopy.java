package Copiying;

public class ReferanceCopy {
	public static void main(String[]args) {
		Student st = new Student(1 ," Amar ",88.60);
		Student st2=st;
		System.out.println(st);
		System.out.println(st2);
		
		st.name="Ankit ";
		st2.id=12;
		
		System.out.println(st);
		System.out.println(st2);//change the all objects and fields
		System.out.println(st.hashCode());//change the all objects and fields
		System.out.println(st2.hashCode());//change the all objects and fields
	}

}
class Student{
	int id;
	String name;
	double marks;
	
	public Student(int id,String name,double marks) {
		this. id=id;
		this.name=name;
		this.marks  = marks;
		
	}
	public String toString() {
		return this.name+id+marks;
	}
}
