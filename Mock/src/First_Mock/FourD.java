package First_Mock;

import java.util.List;

public class FourD {
	public static void main(String[]args) {
		List<Integer> list = List.of(10,20,30);
		List<Integer> list2 = List.of(10,20,30);
		List<Integer> list3 = List.of(10,20,30);
		List<Integer> list4 = List.of(10,20,30);
		List<Integer> list5 = List.of(10,20,30);
		List<Integer> list6 = List.of(10,20,30);
		List<Integer> list7 = List.of(10,20,30);
		List<Integer> list8 = List.of(10,20,30);
		
		List<List<Integer>> list9 = List.of(list,list2);
		List<List<Integer>> list10 = List.of(list3,list4);
		List<List<Integer>> list11 = List.of(list5,list6);
		
		List<List<Integer>> list12 = List.of(list,list2);
		List<List<Integer>> list13 = List.of(list3,list4);
		List<List<Integer>> list14 = List.of(list5,list6);
		
		
		List<List<List<Integer>>> list15 = List.of(list9,list10,list11);
		List<List<List< Integer>>> list16 = List.of(list12,list13,list14);
		List<List<List<Integer>>> list17 = List.of(list9,list10,list11);
		List<List<List< Integer>>> list18 = List.of(list12,list13,list14);
		
		
		List<List<List<List<Integer>>>> list19=List.of(list15,list16,list17,list18);
	    
			int li=list19.stream().flatMap(i->i.stream()).flatMap(i->i.stream()).flatMap(i->i.stream())
			.reduce(0,(i,j)->i+j);
			
			System.out.println(li);
			
			
			
			
		
		
		
		
	}

}
