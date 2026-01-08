package reglection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateConst {
	public static void main(String[]args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c1=Third.class;
		
		for(Constructor<?>c:c1.getDeclaredConstructors()) {
			System.out.println(c);
		}
		Constructor<?> what =c1.getDeclaredConstructor(int.class);
		what.setAccessible(true);
		what.newInstance(12);
	}

}
class Third{
	int id;
	private Third(int id) {
		this.id=id;
		System.out.println("Constructor called....");
	}
}
