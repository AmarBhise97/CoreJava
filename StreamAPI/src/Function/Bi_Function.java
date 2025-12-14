package Function;

import java.util.function.BiFunction;

public class Bi_Function {
	public static void main(String[]args) {
		
		BiFunction <String,StringBuffer,Integer> bi=(i,j)->(i.length()+j.length());
		System.out.println(bi.apply("asdf" ,new StringBuffer("sdfg")));
	}

}


