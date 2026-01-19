package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Bi_Function {
	public static void main(String[]args) {
		
		BiFunction <StringBuffer,String,Integer> bi=(i,j)->(i.length()+j.length());
		System.out.println(bi.apply(new StringBuffer("srtytjhdfg") ,"asdf"));
		
		
	}

}


