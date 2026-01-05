package advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Secong {
	public static void main(String[]args) {
		ExecutorService ex =  Executors.newFixedThreadPool(5);
		for(int i=0;i<=5;i++) {
			Thread_2 th = new Thread_2(1);
			ex.execute(th);
			
		}
		ex.shutdown();
		
		
	}

}
class Thread_2 extends Thread{
	int id;
	public Thread_2(int id) {
		this.id=id;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" geting Threads " +this.id);
		
		for(int i= 0;i<2;i++) {
			System.out.println(i);
			
		}
	}
}
