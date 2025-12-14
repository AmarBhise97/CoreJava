package Function;

import java.util.function.BiFunction;


public class Bi_FunCustom {
	public static void main(String[]args) {
		BiFunction<String,StringBuffer,Integer> bi =Demo::add;
		System.out.println(bi.apply("abcd",new StringBuffer("assd")));
		

}
}
class Demo{
	public static int add(String i,StringBuffer j) {
		return i.length()+j.length();
		
	}
}
