package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Stack_1 {
	public static void main(String[]args) {
		Stack<Integer> li = new Stack<>();
		li.push(12);
		li.push(12);
		li.push(null);
		li.push(null);
		li.push(16);
		li.push(17);
		li.push(18);
		li.push(13);
		System.out.println(li.peek());
		System.out.println(li.pop());
		System.out.println(li.remove(3));
		System.out.println(li);
		
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}

}
