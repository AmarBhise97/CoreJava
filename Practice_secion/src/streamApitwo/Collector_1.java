package streamApitwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collector_1 {
	public static void main(String[]args) {
		List<Integer> list= Arrays.asList(12,34,56,45,43,5,34,3,54);
		
	
		
		Map<Object, List<Integer>> mp=list.stream().collect(Collectors.groupingBy(i->i>50 && i%2==0));
		System.out.println(mp);
	}

}

class Book1 implements Collector<Integer,List<Integer>,List<Integer>>{


	public Supplier<List<Integer>> supplier() {
		
		return ArrayList::new;
	}


	public BiConsumer<List<Integer>, Integer> accumulator() {
		
		return null;
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<List<Integer>, List<Integer>> finisher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
