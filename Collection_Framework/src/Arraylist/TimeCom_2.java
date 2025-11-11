package Arraylist;

import java.util.ArrayList;

public class TimeCom_2 {
public static void main(String[]args) {
	ArrayList<Laptop1>list=new ArrayList();
	for(int i=0;i<=1000000;i++) {
		list.add(new Laptop1(i,"ab"+i,1000.0+i,new int []{12,56,3},"av"+i));
	}
		long starttime=System.nanoTime();
		list.remove(9);
		long endtime=System.nanoTime();
		long total_time=starttime-endtime;
		System.out.println(total_time);
	
	//999000==>-15800, -18700,-20800
	//9==> -495800,-418300
		
	
}
}
class Laptop1{
	int id;
	String name;
	double price;
	int servising[];
	
	String model;
	public Laptop1(int id, String name, double price, int[] servising, String model) {
		super();
		this.id = id;
		this.name = name;
		this.servising = servising;
		this.price = price;
		this.model = model;
	}
	
	
}