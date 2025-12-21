package static_1;

public class Static_1 {
public static void main(String[] args) {
		
		
		Human mahesh=new Human();
		mahesh.name="Suresh";
		mahesh.height=100;
		mahesh.weight=60;
		mahesh.age=16;
		
		mahesh.alive();
		
		
		Human avi=new Human();
		avi.name="Ankit";
		avi.height=150;
		avi.weight=45;
		avi.age=21;
		
		avi.alive();
		
		
		Human atharva=new Human();
		
		atharva.name="Amar";
		atharva.height=160;
		atharva.weight=55;
		atharva.age=24;
		
		atharva.alive();
		
		
		System.out.println("Amar:"+avi.name);
		System.out.println("Surash:"+mahesh.name);
		System.out.println("Ankit:"+atharva.name);
		
		
		
		
		
	}

}

class Human
{
	static String name;
	int height;
	int age;
	int weight;
	
	public  void alive()
	{
		System.out.println("yes I am alive");
		System.out.println(name);
	}
	

}
