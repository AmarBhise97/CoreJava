package oops;

public class multydymansional_1 {
	public static void main(String[]args) {
		Evengine ev = new Evengine(12,"ES20","Petrol");
		ev.printcar();
	}

}
class Car{
	int id;
	String model;
	String fuealType;
	public Car(int id, String model, String fuealType) {
		
		this.id = id;
		this.model = model;
		this.fuealType = fuealType;
	}
	public void printcar() {
		System.out.println("ID : "+id);
		System.out.println("model : "+model);
		System.out.println("fuealtype : "+fuealType);
		
	}
	
	
	
}
class Engine extends Car{

	public Engine(int id, String model, String fuealType) {
		super(id, model, fuealType);
		System.out.println("Engine will be starts...............");
	}
	
}
class Evengine extends Engine{

	public Evengine(int id, String model, String fuealType) {
		super(id, model, fuealType);
		System.out.println("Evengine will be started............");
	}
	
}
