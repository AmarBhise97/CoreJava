package map;

import java.util.HashMap;
import java.util.Map;

public class SetLogic_1 {
public static void main(String[]args) {
	String str = "AMARbhiseamar";
	String str2=str.toLowerCase();
	char[]char1=str2.toCharArray();
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	for(int i=0;i<char1.length;i++) {
		int counter=1;
		if(map.containsKey(char1[i])) {
			counter=map.get(char1[i])+1;
			map.put(char1[i], counter);
			
		}
		else {
		map.put(char1[i], counter);
		}
		
	}
	System.out.println(map);	
	
	
}
}
