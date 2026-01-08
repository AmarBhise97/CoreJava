package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashM_2 {
public static void main(String[]args) {
	Map<School,Integer> map=new HashMap<School,Integer>();
     map.put(new School(3," Amar "," BCA "), 1);
     map.put(new School(1," Amar "," BCA "), 2);
     
    
     School ch = new School(1," Amar "," BCA ");
     System.out.println(ch.hashCode());
     School ch1 = new School(1," Amar "," BCA ");
     System.out.println(ch.hashCode());
     System.out.println("Map: "+map);
     
    
}
}
class School{
	int id;
	String name;
	String Class;
	public School(int id,String name,String Class) {
		this.id=id;
		this.name=name;
		this.Class=Class;
	}
	public String toString() {
		return (this.id+this.name+this.Class);
	}
	public int hashCode() {
		
		return Objects.hash(this.id,this.name,this.Class);
		
	}
	public boolean equals(Object o) {
		School sch=(School)o;
		return (this.id==sch.id && this.name.equals(sch.name) && this.Class.equals(sch.Class));
	}
	
	
}