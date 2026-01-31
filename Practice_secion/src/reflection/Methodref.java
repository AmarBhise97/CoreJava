package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Methodref {
	public static void main(String[]args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c1 = Stud.class;
//		Method[] md = c1.getDeclaredMethods();
//		for(Method m:md) {
//			System.out.println(m);
//		}
		Method mtd = c1.getDeclaredMethod("add", int.class,int.class);
		Method mtd1 = c1.getDeclaredMethod("add2", String.class,String.class);
		Constructor<?> c = c1.getDeclaredConstructor();
	
	Stud std = (Stud)c.newInstance();
	mtd.setAccessible(true);
	mtd.invoke(std,10,30);
	mtd1.setAccessible(true);
	mtd1.invoke(std, "Amar","TnPk");
	
		
	}

}
class Stud{
	
	private void add(int id,int  id2) {
		System.out.println("Run the method");
		System.out.println(id+id2);
	}
	
	public void add2(String name,String name2) {
		System.out.println("run 2nd method");
		
		System.out.println(name.toLowerCase()+" "+name2.toUpperCase());
		//System.out.println(name2.toUpperCase());
		
	}
	
}
