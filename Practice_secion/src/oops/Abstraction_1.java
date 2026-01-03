package oops;

public class Abstraction_1 {
	public static void main(String[]args) {
		Fifs f1 = new Fifs();
		f1.add(0);
		f1.add2(0, null);
	}

}

abstract class Demo2 {
	abstract public void add(int id);

	public void printing() {
		System.out.println("public method in abstract class");
	}
	
	abstract void add2(int id ,String name);

}
class Fifs extends Demo2{


	public void add(int id) {
		id=10;
		
		System.out.println("Id :" +id);
	
	}

	
	void add2(int id, String name) {
		id=20;
		name = "Amar";
		System.out.println("Id :"+id);
		System.out.println("String :"+name);
		
		
		
	}


	
	
}
