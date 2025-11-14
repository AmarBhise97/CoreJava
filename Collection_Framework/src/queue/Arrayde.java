package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Arrayde {
	public static void main(String[]args) {
		Queue <String> de= new ArrayDeque<String>();
		
		de.add("ad");
		de.add("hd");
		de.add("nf");
		de.add("gd");
		de.add("cd");
		de.add("ad");
		de.add("bd");
		System.out.println(de);
		System.out.println(de.remove());
		System.out.println(de);
		System.out.println(de.peek());
		System.out.println(de);
		System.out.println(de.poll());
		System.out.println(de);
		/**
		 * in the ArrayDequeee it cna be pool and remove mentain insertation order
		 * not mentain sorting oreger.
		 */
	}
	}


