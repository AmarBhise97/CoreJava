package Multythreading;

public class EvenorPrime {
	public static void main(String[]args) {
		
		Even ev = new Even();
		Prime pm = new Prime();
		ev.start();
		pm.start();
		
		
		
	}

}
class Even extends Thread{

	
	public void run() {
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				System.out.println("Even : "+i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
class Prime extends Thread{


	public void run() {
		
		for(int i=2;i<100;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		boolean flag =false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
				flag=true;
				}
				
			}
			if(!flag) {
				System.out.println("Prime :"+i);
			}
			
		}
		
	}
	
}
