package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Method2 {
	public static void main(String[]args) throws Exception{
		Class<?> c = Employee1.class;
		Method [] m1 = c.getDeclaredMethods();
		
		for(Method m:m1) {
			System.out.println(m);
		}
		
		Constructor <?> con = c.getDeclaredConstructor();
		Employee1 emp = (Employee1) c.newInstance();
		Method m2 = c.getDeclaredMethod("add", int.class,int.class);
		m2.setAccessible(true);
		m2.invoke(emp, 10,20);
		
		Method m3 = c.getDeclaredMethod("add2", String.class,int.class);
		m3.setAccessible(true);
		m3.invoke(emp, "Amar",23);
		
		
	}

}
class Employee1{
	
	public void add(int a,int b) {
		System.out.println("method will add....");
		System.out.println(a*b);
	}
	
	private void add2(String name,int id) {
		System.out.println("method will add2.....");
		System.out.println(name + " "+id);
	}
}
