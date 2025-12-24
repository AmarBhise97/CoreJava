package basic;

public class Third {
	public static void main(String[] args) throws InterruptedException {
		Runnable r=()->{
			for(int i=0;i<100;i++) {
				System.out.println("**");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		Number num = new Number();
		Thread th =new Thread(r);
		num.start();
		//num.join();//////Execution one by one///////////////////////////////////////
		th.start();
		th.join();
		

	}

}

class Number extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("number :" + i);
			try {
				
			
			Thread.sleep(1000);
			}
			catch(Exception ex) {
				ex.printStackTrace();
				
			}
		}
	}

}
