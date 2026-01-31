package Multythreading;

public class Synchronized {
	public static void main(String[]args) throws InterruptedException {
		Count c = new Count();
		Thread th = new Thread(()->{
			for(int i=0;i<5001;i++) {
				c.increment();
			}
		});
		Thread th1 = new Thread(()->{
			for(int i=0;i<500;i++){
				c.increment();
			}
		});
		th.start();
		th1.start();
		th.join();
		th1.join();
		
		System.out.println(c.count);
	}

}
class Count{
	int count=0;
	synchronized public void increment() {
		/**
		 * using synchronized we can gives actual output.
		 * without synchronized we can not actual output.
		 */
		count++;
	}
	
}
