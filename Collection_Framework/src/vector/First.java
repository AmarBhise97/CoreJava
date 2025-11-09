package vector;

import java.util.Vector;

public class First {
public static void main(String[]args) {
	
	Vector<Object> vec=new Vector<Object>();
	vec.add("12");
	vec.add("12");
	vec.add(34);
	vec.add(56);
	System.out.println(vec);
	vec.contains("Add");
	
	vec.setSize(6);
	vec.get(2);
	vec.getFirst();
	//vec.clear();
	vec.removeFirst();
	System.out.println(vec);
	vec.removeLast();
	vec.addAll(vec);
	System.out.println(vec);
}
}
