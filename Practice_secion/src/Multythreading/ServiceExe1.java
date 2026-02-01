package Multythreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServiceExe1 {
	public static void main(String[]args) {
		ExecutorService ser=Executors.newFixedThreadPool(4);
		for(int i=0;i<10;i++) {
			Student st = new Student(i);
			ser.execute(st);
		}
		ser.shutdown();
		
	}

}
class Student extends Thread{
	int id;
	public Student(int id) {
		this.id=id;
	}
	public void run() {
		System.out.println(Thread.currentThread()+"Current thread"+this.id);
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	
}