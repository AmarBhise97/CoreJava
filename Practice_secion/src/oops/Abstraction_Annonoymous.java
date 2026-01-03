package oops;

public class Abstraction_Annonoymous {
	public static void main(String[]args) {
		Six six = new Six(10,"Amar") {

			
			void pt(int id1) {
				id1=16;
				System.out.println(id1);
				
			}
			
		};
		six.print();
		six.pt(2);
	}

}
abstract class Six{
	int id ;
	String name;
	public Six(int id ,String name) {
		this.id=id;
		this.name=name;
	}
	public void print() {
		System.out.println("Id :" +id);
		System.out.println("Name :" +name);
	}
	abstract void pt(int id1);
	
}
class Ditermine extends Six {

	public Ditermine(int id, String name) {
		super(id, name);
		
	}

	
	void pt(int id1) {
		System.out.println(id);
		
	}
	
	
}
