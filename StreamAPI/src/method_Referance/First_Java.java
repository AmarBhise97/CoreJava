package method_Referance;

import java.util.function.Predicate;

public class First_Java {
	public static void main(String[]args) {
		/**
		 * Predicate<Integer> pre = (i)->{return i%2==0;};
		 * System.out.println(pre.test(22));
		 */
		
		Predicate <Integer> pre = Student::add;
		System.out.println(pre.test(12));
		
		Predicate <String>pre1 = Student::add2;
		System.out.println(pre1.test("1234"));
		
		Predicate <Float> pre2 = Student::add3;
		System.out.println(pre2.test(33f));
		
		Predicate<Double> pre3 = Student::add4;
		System.out.println(pre3.test(245.5));
		
	}

}
class Student{
	
	public static boolean add(int i) {
		return i%2==0;
		
	}
	public static boolean add2(String i) {
		return i=="12334";
	}
	
	public static boolean add3(float i) {
		
		return i>10;
	}
	public static boolean add4(double i) {
		return i<100;
	}
	
}
