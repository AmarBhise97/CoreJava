package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Conref {
	public static void main(String[]args)throws Exception {
		Class<?> c = Company.class;
		Constructor<?> con =c.getDeclaredConstructor(int.class,String.class);
		Constructor<?> con1 =c.getDeclaredConstructor(int.class,String.class,String.class);
		Constructor<?> con2 =c.getDeclaredConstructor();
		
		
		
		Field  f1 = c.getDeclaredField("id");
		Company com =(Company) c.newInstance();
		f1.setAccessible(true);
		f1.set(com, 12);
		System.out.println(f1.get(com));
		System.out.println("*******************************************");
		
		Method  m1 = c.getDeclaredMethod("add", int.class,String.class);
		m1.setAccessible(true);
		m1.invoke(com, 1,"Amar");
		
		System.out.println("******************************************");
		
	
		con.setAccessible(true);
		Company conn = (Company)con.newInstance(12,"Amar");
		System.out.println(conn);
		
		System.out.println("===================================================");
		
		con1.setAccessible(true);
		Company conn1 =(Company) con1.newInstance(12,"Amar","Latur");
		System.out.println(conn1);
		
		System.out.println("====================================================");
		con2.setAccessible(true);
		Company conn2=(Company)con2.newInstance();
		
		System.out.println(conn2);
		
		
	}

}
class Company{
	private int id;
	String name;
	String address;
	
	protected Company() {
		System.out.println("Hey i am default.....");
	}
	
	private Company(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println("Hey i am two parameters.....");
		
	}
	private Company(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
		System.out.println("Hey i am three parameters");
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	private void add(int idd,String name2) {
		System.out.println("Hey i am method....");
		System.out.println(idd+" "+name2);
		
	}
	
}
