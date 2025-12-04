package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Limitos_Skip_2 {
	public static void main(String[] args) {
		Student stu = new Student("Amar ",101);
		Student stu1 = new Student("Suresh",102);
		Student stu2 = new Student("Ranvir",102);
		Student stu3 = new Student("Kerti",104);
		
		List<Student> list = new ArrayList<Student>();
		list.add(stu);
		list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        
		list.stream().sorted().distinct().forEach((i)->{System.out.println(i);});

	}

}

class Student implements Comparable<Student>{
	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public int hashCode() {
		return Objects.hash(this.id);
	}

	public boolean equals(Object o) {
		Student st = (Student) o;
		return this.id == st.id ;
	}
	
	public int compareTo(Student s) {
		return Integer. compare(this.id,s.id);
	}
	public String toString() {
		return this.name+this.id+" ";
	}

}
