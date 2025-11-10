package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Fourth {
public static void main(String[]args) {
	List<Integer> list = new ArrayList<Integer>();
	for(int i=0;i<5;i++) {
		list.add(i+1);
	}
	list.add(67);
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
}
}
