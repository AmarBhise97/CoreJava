package Inheritance;

public class Sixth {
public static void main(String[]args) {
	Lambo ld1 = new Lambo();
	ld1.Start_childrec();
	ld1.getHp();
}
}
class Super_car{
	String engine=".90l Desile";
	String hp;
	public void start() {
		System.out.println("Car started....");
	}
	public Super_car(String hp) {
		
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getHp() {
		return this. hp;
	}
	
}
class Lambo extends Super_car{
	String engine_e1 = super.engine;
	public Lambo() {
		super("100hp");
		System.out.println("Childree class accessed");
		
		
	}
	public void Start_childrec() {
		super.start();
		System.out.println(super.engine);
		System.out.println(this.engine);
		System.out.println(this.engine_e1);
		System.out.println("Geeting the hp's");
		System.out.println(super.getHp());
	}
}