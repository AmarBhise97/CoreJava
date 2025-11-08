package inheritance2;

public class Second {
	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		System.out.println("=============");
		Book book = new Book();
	}
}

class Student {//////hierarchical inheritance////////
	public Student() {
		System.out.println("Student.....");
	}
}

class Book extends Student {
	public Book() {
		System.out.println("Book....");
	}
}

class NoteBook extends Student {
	public NoteBook() {
		System.out.println("NoteBook.....");
	}
}