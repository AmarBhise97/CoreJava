package inter;

public class First {
	public static void main(String[] args) {
		Class c1 = new Jvm();
		c1.student(" Student Name");
		c1.book(" Book name");
		c1.notebook("Name");
		System.out.println("******************************************************");
		Class c2 = new Cocsit();
		c2.student("Student Name");
		c2.book("bookname");
		c2.notebook("name");
		
	}
}

interface Class {

	public void student(String name);

	void book(String bookname);

	// protected void collage(String name);//Protected and private modifier
	// not used in interface
	default void notebook(String name) {
		System.out.println("Interface Class method print....");
		// when use default method then use you can not after change the another class
		// if you two class create and implement the methods and you can add-
		// method in interface than will code is fatla.

	}
}

class Jvm implements Class {
	public void student(String name) {
		System.out.println(" Jvm School Amar  :: 01 :: 88.80:" + name);
	}

	public void book(String bookname) {
		System.out.println("Sham Chi aai :: 50$ :" + bookname);
	}

}

class Cocsit implements Class {

	public void student(String name) {
		System.out.println("Cocsit Collage = Aryan :: 02 :: 76.80 " + name);

	}

	public void book(String bookname) {
		System.out.println("Book name = C++" + bookname);

	}

}