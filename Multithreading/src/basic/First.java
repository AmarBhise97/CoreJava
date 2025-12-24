package basic;

public class First {
	public static void main(String[]args) throws InterruptedException {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		d1.start();
		d2.start();
		d3.start();
		for(int i=0;i<100;i++) {
			System.out.println("*");
			Thread.sleep(1000);
		}
		
	}

}
class Demo extends Thread{
	public void run() {
		for (int i=0;i<100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
