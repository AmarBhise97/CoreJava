package linkedlist;


import java.util.LinkedList;



public class Second {
	public static void main(String args[]) {
		LinkedList<Laptop>list=new LinkedList();
		long starttime=System.nanoTime();
		
		for(int i=1;i<=1000000;i++) {
			list.add(new Laptop(i,"hp"+i,100.0+i,new int [] {12,23,34},"ab"+i));
		}
		long endtime=System.nanoTime();
		
		long total_time=endtime-starttime;
		System.out.println( total_time);
		
		/**
		 * ArrayList timecomparisum---> 1341061000,1388176400
		 */
		//LinkedList time 361175000,312472200
	}
	}
	class Laptop{
		int id;
		String name;
		double price;
		int []servicing;
		String model;
		public Laptop(int id, String name, double price, int[] servicing, String model) {
		
			this.id = id;
			this.name = name;
			this.price = price;
			this.servicing = servicing;
			this.model = model;
		}
		
	}

