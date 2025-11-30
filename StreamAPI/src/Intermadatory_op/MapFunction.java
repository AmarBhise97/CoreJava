package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapFunction {
public static void main(String[]args) {
	List <Integer> list = new ArrayList<Integer>();
	list.add(123);
	list.add(234567);
	list.add(87678);
	list.add(3456);
	list.add(12);
	
	list.stream()
	.map(new ConvertString())
	.forEach((i)->System.out .println(i));
	
	System.out.println("====================================================");
	
	
	//(i)->""+i == map ==True
	//(i)-> {return " "+i == map == true  both are same.
			
			
	list.stream()
	.map((i)->  ""+i)
	.filter((i)-> (i.length()>3))
	.forEach((i)->System.out.println(i));	
}
}
class ConvertString implements Function< Integer,String>{
	public String apply(Integer i) {
		return "AB"+i;
	}


}
