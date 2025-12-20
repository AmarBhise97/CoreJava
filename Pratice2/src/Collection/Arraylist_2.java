package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylist_2 {
	public static void main(String[]args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 =new Student("Amar",12);
		Student s2 =new Student("Om",14);
		Student s3 =new Student("Yenkat",13);
		Student s4 =new Student("Aryan",007);
		
		
		
		
			list.add(new Student("Amar",1));
			list.add(s2);
			list.add(s3);
			list.add(s4);
			
		
	
		list.forEach((i)->{System.out.println(i);});
		
	
		
		
	}

}
class Student{
	String name;
	int id;
	
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	public String toString() {
		return name+" "+id;
	}
	
	
	
	
	
	
}
