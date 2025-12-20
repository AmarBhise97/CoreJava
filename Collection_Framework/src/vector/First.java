package vector;

import java.util.Vector;

public class First {
public static void main(String[]args) {
	
	Vector<Object> vec=new Vector<Object>();
	vec.add("12");
	vec.add("12");
	vec.add(34);
	vec.add(56);
	vec.add(78);
	vec.add(545);
	vec.add(57);
	vec.add(566);
	System.out.println(vec);
	System.out.println(vec.contains("om"));
	
	//vec.setSize(12);
	//System.out.println(vec.get(2));
	//vec.getFirst();
	//vec.clear();
	vec.removeFirst();
	System.out.println(vec);
	vec.removeLast();

	System.out.println(vec);
	
}
}
