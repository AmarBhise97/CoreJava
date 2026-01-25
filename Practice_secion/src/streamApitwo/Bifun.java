package streamApitwo;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;



public class Bifun {
	public static void main(String[]args) {
		BiFunction<StringBuffer,StringBuffer,Integer> bi = (i,j)->i.length()+j.length();
		System.out.println(bi.apply(new StringBuffer("dfbgn"),new StringBuffer( "dfbgh")));
		
		
		BinaryOperator<Integer> bo =(i,j)->i*j;
		System.out.println(bo.apply(12, 01));
		
		List<Integer> list = List.of(1,5,5,9,5,2,2,0,4,9);
		
		list.stream().filter(i->Collections.frequency(list, i)==1).forEach(System.out::println);
		
		//System.out.println(sum);
	}

}
