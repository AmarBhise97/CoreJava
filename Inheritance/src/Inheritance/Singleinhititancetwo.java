package Inheritance;

public class Singleinhititancetwo {

	 public static void main(String[] args) {
	        Student s = new Student();

	        s.display(); // from Person
	        s.show();    // from Student
	    }
}
class Person {
    String name = "John";

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int roll = 101;

    void show() {
        System.out.println("Roll No: " + roll);
    }
}


