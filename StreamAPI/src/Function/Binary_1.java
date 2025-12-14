package Function;

import java.util.function.BinaryOperator;

public class Binary_1 {
	public static void main(String[]args) {
		BinaryOperator<Integer> bi =((i,j)->(i+j));
		System.out.println(bi.apply(45, 00005));
		
		System.out.println("==========================================");
		
		BinaryOperator<Integer> ni=Demo1::add;
		System.out.println(ni.apply(12,20));
		
	}

}
class Demo1{
	public static int add(Integer i,Integer j) {
		return (i+j);
		
	}
}


