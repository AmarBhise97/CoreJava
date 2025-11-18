package map;

import java.util.Hashtable;

public class HashT_1 {
public static void main(String[]args) {
	
	Hashtable<Integer,String> table =new Hashtable<Integer,String>();
	//table.put(null, null);
	/**
	 * no use single key or single value.
	 */
	
	table.put(1, "Amar");
	table.put(8, "Rohiy");
	table.put(0, "Kirti");
	table.put(11, "Tankil");
	table.put(6, "Raju");
	table.put(1, "Sham");
	table.put(7, "Kotic");
	System.out.print(table);
	System.out.println(table.getOrDefault(0, "Ankit"));
	/**
	 * getOrDefault method is used to this key value present or not
	 */
	System.out.println(table);
	System.out.println("****************************************************");
	System.out.println(table.putIfAbsent(12,"Akash"));
	/**
	 * PutIfAbsent method is uset to if key value already stored and
	 * value get different than shown this value is already stored
	 * value be print
	 * 
	 *if you can add anotere key and anoter value than it will be
	 *add the key using PutIfAbsent.
	 */
	System.out.println(table);
	System.out.println("*******************************************");
	System.out.println(table.containsKey(9));
	System.out.println(table);
	/**
	 * contains key check if available or note.
	 */
	System.out.println("********************************************");
	System.out.println(table.getOrDefault(7, "kkkk"));
	/**it is used to available key value present or not
	 * 
	 */
	System.out.println(table);
	
}
}
