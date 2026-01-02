package basic;

import java.util.ArrayList;
import java.util.List;

public class Mutual_demo {
	public static void main(String[] args) {
		Film film = new Film();
		Producer p1 = new Producer(film);
		Consumer c1 = new Consumer(film);
		
		p1.start();
		c1.start();

	}

}

class Film {
	List<Integer> list = new ArrayList<Integer>();

	public synchronized void addlist(int value) throws InterruptedException {
		if (list.size() == 10) {
			System.out.println("Wating the print opperation while memory is full .......");
			wait();

		}
		System.out.println("Printing the values" + value);
		list.add(value);
		System.out.println("Notifying the Consumer.......");
		notify();

	}
	
	

	public synchronized void userNumber()throws InterruptedException {
		if (list.size() == 0) {
			System.out.println("I am wating for the element adding.....");
			wait();

		}
		int num = list.remove(0);
		System.out.println("removing the number " + num);
		System.out.println("====================================================================");
	}
}
class Producer extends Thread{
	Film f;
	public Producer(Film f) {
		this.f=f;
	}
	public void run() {
		int counter =1;
		while(true){
		try {
		Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
			
		}
		try {
			f.addlist(counter);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counter++;
	
	}
	}
	
	
}
class Consumer extends Thread{
	Film f;
	public Consumer(Film f) {
		this.f=f;
	}
	public void run() {
		int counter =1;
		while(true) {
			try {
			Thread.sleep(900);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			try {
			f.userNumber();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
