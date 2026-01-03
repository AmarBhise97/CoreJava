package oops;

public class Polymorphisum {
	public static void main(String[] args) {
    Book bk = new Book();
    bk.book(12, " Amar ", " latur ");
    bk.book(13);
    bk.book(15, " Rushi");
    
	}

}

class Book {
	int id;
	String name;
	String city;
	int  pincode;
	String address;
	

	public Book () {
		
	}
	public void book(int id) {
		System.out.println(id);
	}
	public void book(int id,String name) {
		
		System.out.println(id + name);
	}
	public void book(int id,String name,String pincode) {
		System.out.println(id + name + pincode);
	}
	
	
}
