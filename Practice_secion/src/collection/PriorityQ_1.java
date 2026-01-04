package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ_1 {
	public static void main(String[]args) {
		Queue<Integer> que = new PriorityQueue<>();
		que.add(12);
		que.add(34);
		que.add(87);
		que.add(35);
		que.add(11);
		que.add(13);
		que.add(9);
		que.add(68);
		que.add(19);
		//que.poll();
		que.remove();
		System.out.println(que.peek());
		System.out.println(que);//priority will be only remove and pool time.
		System.out.println(que.peek());
		System.out.println("=========================================");
		
		Iterator<Integer> it = que.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
