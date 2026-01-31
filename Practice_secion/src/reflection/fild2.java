package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class fild2 {
	public static void main(String[]args) throws Exception {
		Class <?> c = Class.forName("reflection.Employee");
		Constructor<?> con = c.getDeclaredConstructor();
		Employee ep = (Employee)c.newInstance();
		Field fi =c.getDeclaredField("id");
		Field fi2 =c.getDeclaredField("name");
		fi.setAccessible(true);
		fi.set(ep, 2);
		System.out.println(fi.get(ep));
		fi2.setAccessible(true);
		fi2.set(ep, "Am");
		System.out.println(fi2.get(ep));
		
		
	    
		
	}

}
class Employee{
	private int id;
	private String name;
	
}
