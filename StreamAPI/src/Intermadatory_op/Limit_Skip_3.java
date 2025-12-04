package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;

public class Limit_Skip_3 {
	public static void main(String[]args) {
		Student1 st = new Student1();
		st.id=12;
		Student1 st2 = new Student1();
		st2.id=13;
		Student1 st3 = new Student1();
		st3.id=14;
		List<Student1>list = new ArrayList<Student1>();
		list.add(st);
		list.add(st2);
		list.add(st3);
		
		list.stream()
		.sorted()
		.limit(2)
		.skip(1)
		.forEach((i)->{System.out.println(i);});
		
		
		
	}

}
class Student1 implements Comparable<Student1>{
	
	int id;
	
	
	public int compareTo(Student1 o) {
		return Integer.compare(this.id, o.id);
	}
	
	public String toString() {
		return this.id+" ";
	}


	


	
}
	

