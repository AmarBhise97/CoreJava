package linkedlist;

import java.util.LinkedList;

public class Second2 {
	public static void main(String[]args) {
		LinkedList<Laptop1>list=new LinkedList();
		for(int i=0;i<=1000000;i++) {
			list.add(new Laptop1(i,"ab"+i,1000.0+i,new int []{12,56,3},"av"+i));
		}
			long starttime=System.nanoTime();
			list.remove(999000);
			long endtime=System.nanoTime();
			long total_time=starttime-endtime;
			System.out.println(total_time);
		
	//AL	//999000==>-15800, -18700,-20800
	//AL	//9==> -495800,-418300
			
	//LL 9==>-20900,-31400,-20700
	//LL 999000==> -36500,-29700,-30900
			
		
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
