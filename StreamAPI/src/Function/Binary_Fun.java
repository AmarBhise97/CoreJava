package Function;

import java.util.Arrays;
import java.util.List;

public class Binary_Fun {
	public static void main(String[]args) {
		List<Integer> li =Arrays.asList(12,12,12);
		
		int Sum=li.stream().reduce(12,(i,j)->{
			System.out.println("i"+i);
			System.out.println("j"+j);
			return i+j;});
		
		System.out.println(Sum);
		
	}

}
