package Multythreading;

public class Demon1 {
	public static void main(String[]args) throws InterruptedException {
		Runnable rn =()->{
	    	for(int i=0;i<10;i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("**");
			
	    	}
		};
		Demo3 de = new Demo3();
		de.setDaemon(true);
		de.start();
		de.sleep(1000);
		
		Thread th = new Thread(rn);
		
		th.start();
	
		
	}
	
}
class Demo3 extends Thread{
 int counter=0;
   public void run() {
	   for(int i=0;i<20;i++) {
		   System.out.println(i);
		   counter++;
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	 
  }
	
	
}
