package fifs_Api;

import java.util.function.Function;

public class Fun_4 {
public static void main(String[]args) {
	Function<Student ,Teacher> fun =(t)->{
	Teacher t1 = new Teacher();
	t1.teachername=t.studentname;
	return t1;
	};
	
	Function <Human ,Student> fun2 =(t)->{
	Student stud = new Student();
	stud.studentname =t.humanname;
	return stud ;};
	
	Function<Human ,Teacher> composite =fun.compose(fun2);
	Human hun = new Human();
	hun.humanname="Amar";
	System.out.println(composite.apply(hun));
	}
	

}
class Student {
	String studentname;
	public String toString() {
		return "student class :" +this.studentname;
		
	}
	
}

class Teacher {
	String teachername;
	public String toString() {
		return "Teacher class :" +this .teachername;
		
	}
}
class Human {
	String humanname;
	public String toString() {
		return "Human class :"+this.humanname;
	}
	
}
