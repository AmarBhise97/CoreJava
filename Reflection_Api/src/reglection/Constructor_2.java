package reglection;

import java.lang.reflect.Constructor;

public class Constructor_2 {
	public static void main(String[]args) throws ClassNotFoundException {
		Class <?> cc = Class.forName("reglection.Car");
		
		Constructor<?>[] c =cc.getDeclaredConstructors();
		for(Constructor C1:c) {
			System.out.println(C1);
			System.out.println(C1.getModifiers());
			System.out.println(C1.getParameterCount());
			System.out.println(C1.getParameterTypes());
			//System.out.println("=======================================");
			
			Class<?>[] c4 =C1.getParameterTypes();
			
			for(Class<?> cl:c4) {
				System.out.println(cl.getName());
			}
			
		}
		System.out.println("======================================");
		System.out.println(c.length);
		}

}
class Car{
	private int id;
	String model;
	double price;
	
	public Car() {
		
	}
	private Car(int id) {
	
	}
	public Car(int id,String name,double Price) {
		
	}
}
