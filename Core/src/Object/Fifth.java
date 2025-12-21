package Object;

public class Fifth {
public static void main(String[] args) {
		
		int age=100;
		System.out.println(age);
		
		Demo1 d=new Demo1(); //d is the instance Demo.
		d.demo();
		d.eat();
		
	}

}

class Demo1
{
	public void demo()
	{
		System.out.println("demo...");
	}
	public void eat()
	{
		
		System.out.println("eating...");
	}
	
	public void eatery()
	{
		System.out.println("going out...");
	}

}
