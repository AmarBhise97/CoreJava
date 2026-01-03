package oops;

public class OverridingPoly {
	public static void main(String[]args) {
      Over al = new AllOver(12,"Amar");
      al.remove();
}
}
class Over{
	int id;
	String name;
	
	public Over(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public void remove() {
		System.out.println("Over is printing for parent class..................");
	}
}
class AllOver extends Over{
   
	
	public AllOver(int id, String name) {
		super(id, name);
		System.out.println("AllOver will printing in child class.....................");
	}

	public void remove() {
		System.out.println("Allover method will print ..........**");
	}
	
}