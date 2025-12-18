package Terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class First_Collect {
	public static void main(String[]args) {
		List<Integer> list = Arrays.asList(12,23,24,35,4,6,68,37,46,3);
		List<Integer> sum = list.stream().collect(new Storing());
		System.out.println(sum);
	}

}
                                   
//                              T (input type) A(Acculamator) R(return /output)
class Storing implements Collector<Integer, List<Integer>, List<Integer>> {

	public Supplier<List<Integer>> supplier() {
		return ArrayList::new;
	}

	//                          A     T
	public BiConsumer<List<Integer>, Integer> accumulator() {

		return (list, integer) -> {
			if(integer>30&& integer %2!=0) {
			list.add(integer);
			}

		};
	}

	//                     A
	public BinaryOperator<List<Integer>> combiner() {

		return (list1, list2) -> {
			list1.addAll(list2);
			return null;
		};
	}

	public Function<List<Integer>,List< Integer>> finisher() {

		return (list)->(list);
	}

	public Set<Characteristics> characteristics() {
		
		return new HashSet<Collector.Characteristics>();
	}
}
