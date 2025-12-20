package queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class First {
	public static void main(String[] args) {
		Queue<Integer> qe = new ArrayDeque<Integer>();
		Queue<Integer> qe1 = new PriorityQueue<Integer>();

		qe.add(12);
		qe.add(24);
        qe.add(12);
		qe.add(11);
		qe.add(69);
		qe.add(23);
		qe.add(2);
		//qe.add(null);
		/**
		 * ArrayDeque mention insertation order.not sorting 
		 * not allowed null values.
		 * Allow duplicate elements.
		 */
		System.out.println(qe);
		System.out.println(qe.poll());
		System.out.println(qe);
		System.out.println(qe.poll());
		System.out.println(qe);
		System.out.println(qe.poll());
		System.out.println(qe);
		System.out.println(qe.remove());
		System.out.println(qe);
		
		System.out.println("*******************************************");
		qe1.add(12);
		qe1.add(24);
		qe1.add(12);
		qe1.add(23);
		qe1.add(56);
		qe1.add(2);
		
		//qe1.add(null);
		/**
		 * PriortyQueue not maintain insertatiin order or not the sorting.
		 * not allowed null values.
		 * allow duplicate elements.
		 */
		System.out.println(qe1);
		System.out.println(qe1.poll());
		System.out.println(qe1);
		System.out.println(qe1.poll());
		System.out.println(qe1);
		System.out.println(qe1.poll());
		System.out.println(qe1);
		System.out.println(qe1.poll());
		System.out.println(qe1);
		/**
		 * if the remove and poll time it can be remove assanding order .
		 */
	}
}
