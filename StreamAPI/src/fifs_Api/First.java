package fifs_Api;

import java.util.function.Predicate;

public class First {
	public static void main(String[]args) {
		// Negate => reverse the result of the test method
		//AND => works on the two predicates and has the logic of LOGICAL AND.
		
		
//		Predicate <Integer>pred =(i)->{return i<10==false;};
//		Predicate <Integer>pred2 =(j)->{return j>50==false;};
//		Predicate <Integer>pred3 =pred.and(pred2);
//		/**
//		 * works on the .and logic
//		 */
//		System.out.println(pred3.test(51));
		Predicate <Integer>pred =(i)->{return i>10;};
		Predicate <Integer>pred2 =(j)->{return j>50;};
		Predicate<Integer> pred3=pred;
		System.out.println(pred3.test(20));
		
		
		
		
	}

}
