package Set;

import java.util.HashSet;
import java.util.Set;

public class Fourth {
public static void main(String[]args) {
	Student s1 = new Student(1,"Amar");
	Student s2 = new Student(2,"Amar");
	Student s3 = new Student(1,"Amar");
	Set <Student> set = new HashSet<Student>();
	set.add(s3);
	set.add(s2);
	set.add(s1);
	System.out.println("Printing the size");
	System.out.println(set.size());
	
}

}
class Student{
	int id;
	String name;
	static int counter=1;
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
		counter++;
		
	}
	public int hashCode() {
		System.out.println("hashcode :");
		return 100;
	}
	public boolean equals(Object o) {
		System.out.println("Equals :");
		return true;
	}
	
}