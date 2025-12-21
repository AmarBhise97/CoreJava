package copying;

public class Depp_Copying_Clone {
	public static void main(String[]args) throws CloneNotSupportedException {
		School sc = new School("COCSIT", 402);
		Student11 st = new Student11(12,"Amar", 88.40, sc);
		System.out.println(st);
		System.out.println("=========================================================");
		Student11 st1 =(Student11)st.clone();
		System.out.println(st1);
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println("==========================================================");
		st.sc.school_ID=507;
		System.out.println(st);
		System.out.println(st1);
	}

}
class Student11 implements Cloneable{
	int id ;
	String name;
	double marks;
	School sc;
	public Student11(int id,String name,double marks,School sc) {
		this.name=name;
		this.id=id;
		this.marks=marks;
		this.sc = sc;
		
		
	}
	public Object clone()throws CloneNotSupportedException {
		Student11  std = (Student11)super.clone();
		std.sc=(School)this.sc.clone();
		return std;
		
	}
	public String toString() {
		return this.id+" "+ marks+" "+ name+" "+ sc.school_name+" "+ sc.school_ID;
	}
	

	
	
}
class School implements Cloneable{
	String school_name;
	int school_ID;
	public School(String school_name,int school_ID) {
		this.school_name=school_name;
		this.school_ID= school_ID;
		
		
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();	}
	
	
	
}
