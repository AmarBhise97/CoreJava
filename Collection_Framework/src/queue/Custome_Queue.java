package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Custome_Queue {
public static void main(String[]args) {
	Queue<Bank> que = new PriorityQueue<>(new idComparator());
	que.add(new Bank(1011,"SBI","12 Core"));
	que.add(new Bank(101,"SBI","12 Core"));
	que.add(new Bank(107,"SBI","12 Core"));
	que.add(new Bank(109,"SBI","12 Core"));
	que.add(new Bank(103,"SBI","12 Core"));
	que.add(new Bank(104,"SBI","12 Core"));
	que.add(new Bank(100,"SBI","12 Core"));
	for( Bank i:que) {
		System.out.println(i);
	}
	/**
	 * in priorityQueue are not maintain sorting and insertation order 
	 */
}
}
class Bank implements Comparable<Bank>{
	int id;
	String name;
	String balance;
	
	public Bank(int id,String name,String balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}

	@Override
	public int compareTo(Bank o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	public String toString() {
		return this.name + " || "+id+" || "+balance;
	}
	
	
}
class idComparator implements Comparator<Bank>{
	public int compare(Bank o1,Bank o2) {
		return Integer.compare(o2.id, o1.id) ;
		
	}
}
