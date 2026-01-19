package advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Third {
	public static void main(String[]args) {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		for(int i=0;i<=10;i++) {
			Thread_3 th = new Thread_3(i);
			ex.execute(th);
		}
		ex.shutdown();
		
	}

}
class Thread_3 extends Thread
{
	int id;
	public Thread_3(int id) {
		this.id=id;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" GettingThread "+ this.id);
		
		for(int i= 0;i<10;i++) {
			System.out.println(i);
		}
	}
}
