package copying;

public class Shallow_copy_2 {
	public static void main(String[]args) throws CloneNotSupportedException {
		Student1 st = new Student1("Ankit",23,88.60);
		Student1 st2=(Student1)st.clone();
		st2.name="Rj";
		System.out.println(st);
		System.out.println(st2);
		/**
		 *
		 */
	}

}
class Student1 implements Cloneable{
	String name;
	int id;
	double marks;
	School sc;
	
	public Student1(String name,int id,double marks) {
		this.name=name;
		this.id=id;
		this.marks=marks;
		
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString() {
		return this.name+" "+ id+" "+ marks;
	}
}
