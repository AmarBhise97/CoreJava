package advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class First {
	public static void main(String[]args) {
		ExecutorService ser = Executors.newCachedThreadPool();
		for(int i=0;i<100;i++) {
			Thread_1 th = new Thread_1(i);
			ser.execute(th);
		}
		ser.shutdown();
		
	}

}
class Thread_1 extends Thread{
	int id;
	public Thread_1(int id) {
		this.id=id;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Executing "+this.id);
		for(int i =0;i<10;i++) {
			System.out.println(i);
		}
	}
}
