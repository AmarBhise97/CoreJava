package reglection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Private_Method {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c1 = Class.forName("reglection.Fourth");
		Method[] methods = c1.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m);

		}
		Constructor<?> c = c1.getDeclaredConstructor();
		Method m1 = c1.getDeclaredMethod("add", int.class, int.class);
		Fourth f1 = (Fourth)c.newInstance();
		m1.setAccessible(true);
		m1.invoke(f1, 12,12);
		System.out.println(f1);

	}

}

class Fourth {
	private void add(int i, int j) {
		System.out.println("Inside the private method");
		System.out.println(i + j);

	}

	public void add(int i) {
		System.out.println(i * 2);
	}
}
