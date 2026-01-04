package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Custom_hashset {
	public static void main(String[] args) {
		Student st= new Student(12,"Amar ","Latur ",88.80);
		Student st1= new Student(12,"Amar ","Latur +",88.80);
		Student st2= new Student(14,"Amar ","Latur ",88.80);
		Student st3= new Student(15,"Amar ","Latur ",88.80);
		Student st4= new Student(16,"Amar ","Latur ",88.80);
		Student st5= new Student(16,"Amar ","Latur ",88.80);
		
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st5.hashCode());
		System.out.println(st.equals(st5));
		
		System.out.println("====================================");
		Set<Student> set = new HashSet<>();
		
		set.add(st);
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		set.add(st5);
		
		System.out.println(set);
		System.out.println("=======================================");
		
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

class Student {
	int id;
	String name;
	String city;
	double marks;

	public Student(int id, String name, String city, double marks) {

		this.id = id;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public String toString() {
		return this.id + " " + this.name + this.city + this.marks;
	}

	public int hashCode() {
		return Objects.hash(id,name,city,marks);
	}

	public boolean equals(Object obj) {
		Student st = (Student) obj;
		return this.id == st.id && this.name.equals(st.name) && this.city.equals(st.city) && this.marks == st.marks;
	}
	
	
	

}
