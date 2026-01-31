package Multythreading;

public class Multy_1 {
	public static void main(String[]args) throws InterruptedException {
	//	Thread th = new Thread();
		KKR kkr = new KKR();
		KKR kkr1 = new KKR();
		Thread th = new Thread(kkr);
		Thread th1 = new Thread(kkr1);
		
		Runnable r = ()->{
			for(int i=0;i<5;i++) {
				System.out.println("--");
			}
			System.out.println("thread using"+Thread.currentThread().getName());
		};
		Thread thr = new Thread(r);
		thr.start();
		
	   th.start();
		//th.join();
		//th1.start();
		
		for(int i=0;i<5;i++) {
		
			System.out.println("*");
			Thread.sleep(1000);
		}
	}

}
class KKR implements Runnable {


	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
