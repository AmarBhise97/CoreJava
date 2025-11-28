package fifs_Api;

import java.util.function.Consumer;

public class Consumer_1 {
public static void main(String[]args) {
	/**
	 * in consumer not the return type
	 */
	Consumer <Integer> con =(t)->{System.out.println(t*2);};
	Consumer <Integer> con2 =(t)->{System.out.println(t*3);};
	Consumer <Integer> cons3=con;
	cons3.accept(10);
	
}
}
