package reglection;

import java.lang.reflect.Constructor;

public class Constructor_1 {
	public static void main(String[]args) throws ClassNotFoundException {
		Student st = new Student();
		Class<?> c1 = st.getClass();
		Class<?>c2 = Class.forName("reglection.Student");//you are change the name in string than show the exception are classNotFoundException.
		Class<?> c3 = Student.class;
		Constructor<?>[] cons =  c1.getDeclaredConstructors();
		Constructor<?>[] cons1 = c2.getDeclaredConstructors();
		Constructor<?>[] cons2=  c3.getDeclaredConstructors();
		for(Constructor c:cons) {
			System.out.println(c);
		}
		System.out.println("******************************");
		
		for(Constructor c:cons1) {
			System.out.println(c);
		}
		System.out.println("******************************");
		
		for(Constructor c:cons2) {
			System.out.println(c);
		}
		System.out.println("******************************");
	}

}
class Student{
	int id;
	String name;
	double marks;
	
	protected Student() {
		
	}
	 Student(int id) {
		
	}
	public Student(int id,String name,double marks) {
		
		
	}
}
