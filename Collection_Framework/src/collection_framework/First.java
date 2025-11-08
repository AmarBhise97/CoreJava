package collection_framework;

public class First {
public static void main(String[]args) {
	Ianimal<String, Integer> ian = new Tiger<Integer>();
	System.out.println(ian.weight("100")+56);
}
}
interface Ianimal<R,T>{
	R weight(String string);
}
class car{
	int id;
	String name;
	
}
class Tiger<T> implements Ianimal<String,Integer>{

	@Override
	public String weight(String t) {
		// TODO Auto-generated method stub
		return t.toString();
	}
	
}