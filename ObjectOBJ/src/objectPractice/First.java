package objectPractice;

public class First {
public static void main(String[]args) {
	new StringBuffer("ABC");
	Demo d1 = new Demo(100," abc");
	System.out.println(d1);
}
}
class Demo{
	int id;
	String name;
	
	public Demo(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Demo() {
		
	}
	public String toString() {
		return this.id+" .. "+this.name;
	}
	public Object getre(Object obj) {
		if(obj.getClass().equals(Demo.class)) {
			return " I Am A Demo Class";
			
		}
		return obj;
		
	}
}