package basic;

public class Second {
	public static void main(String[]args) throws InterruptedException {
		Even even=new Even();
		Prime prime = new Prime();
		even.start();
		prime.start();
		for (int i=0;i<100;i++) {
			System.out.println("*");
			Thread.sleep(1000);
		}
		
		
	}

}
class Even extends Thread{


	public void run() {
		for(int i= 0 ;i<100;i++) {
			if(i%2==0) {
				System.out.println("Even :"+i);
				try {
				Thread.sleep(1000);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		
		}
		
		
	}
	
}
class Prime extends Thread{


	public void run() {
		for(int i= 2 ;i<100;i++) {
			try {
			Thread.sleep(1000);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			boolean flag =false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag =true;
					
				}
				
				
				}
			if(!flag) {
				System.out.println("Prime :"+ i);
			}
		}
		
	}
	
}
