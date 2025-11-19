package polymorphisum;

public class First {
public static void main(String[]args) {
	Animal animal=new Animal();
	animal.Running(2,2.3);
}
}
class Animal{
	public void Running(int a,int b,int c) {/////////////////Method overloading//////////////////
		System.out.println("Running:1");
	}
	public void Running(int a) {
		this.Running(13,56,78);
		System.out.println("Running:2");
		
		
	}
	public String Running(int a,double c) {
		this.Running(12);
		System.out.println("Running:3");
		return null;
		
	}
}