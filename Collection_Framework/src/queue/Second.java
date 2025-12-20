package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Second {
public static void main(String[]args) {
	Queue <String> d1=new PriorityQueue<String>();
	
	d1.add("ad");
	d1.add("ad");
	System.out.println(d1);
	d1.add("gd");
	d1.add("ad");
	d1.add("cd");
	System.out.println(d1);
	d1.add("bd");
	
	d1.add("kd");
	System.out.println(d1);
	
	//System.out.println(d1.poll());
	System.out.println(d1);
	
//	System.out.println(d1.poll());
//	System.out.println(d1);
//	System.out.println(d1.remove());
//	System.out.println(d1);
//	System.out.println(d1.remove());
//	System.out.println(d1.remove());
//	System.out.println(d1);
	Iterator<String> it=d1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
