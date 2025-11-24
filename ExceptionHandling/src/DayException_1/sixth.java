package DayException_1;

public class sixth {
public static void main(String[]args) {
	Animal animal=new Animal();
animal.getage(29);	
System.out.println("hey there !");
}
}
class Animal{
	static {
		System.out.println("I am Static");
		
	}
	public Animal() {
		System.out.println("Hiiii");
		
	}
	public Animal(int i) {
		System.out.println("Hiii 2");
		
	}
	 public static void getage(int age) {
		try {
		if(age>20 && age<30) {
			System.out.println("Not vallid");
			
		}
		if(age>=30 && age<=40) {
			System.out.println("Sholay");
			
		}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
			
		}
	}
}
