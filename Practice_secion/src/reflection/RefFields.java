package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;





public class RefFields {
	public static void main(String[]args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?>  c1 = Fifth.class;
		Constructor<?> c = c1.getDeclaredConstructor();
		//Constructor<?> cc = c1.getDeclaredConstructors();
		//Object obj = c.newInstance();
		Fifth obj = (Fifth) c.newInstance();
		Field[] f1 = c1.getDeclaredFields();
//		for(Field f:f1) {
//			System.out.println(f);
//		}
		Field ff = c1.getDeclaredField("name");//we can change fild name than show nosuchfieldException
		ff.setAccessible(true);//we can gives false tthats illegalaccessException exception throw
		ff.set(obj, "Amar");
		
		
		System.out.println(ff.get(obj));
	}

}
class Fifth{
	private String name;
	
	String pincode;
	

}