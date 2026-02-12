package First_Mock;

import java.util.List;

public class CommanElements_TwoLists {
	public static void main(String[]args) {
		List<Integer> list1 = List.of(10,20,30,40,50,100,250);
		List<Integer> list2 = List.of(10,20,70,80,49,30,60);
		
		List<Integer> li=list1.stream().filter(list2::contains).toList();
		System.out.println(li);
		
		
		System.out.println("==================using String=================================");
		
		List<String> list3=List.of("Amar","Rushi","Gagan","Tushar");
		List<String> list4=List.of("Rushi","Gagan","Tufgsthar","AMar");
		List<String> li1=list3.stream().filter(list4::contains).toList();
		System.out.println(li1);
		
	}

}
