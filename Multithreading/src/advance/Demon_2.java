package advance;

public class Demon_2 {
	public static void main(String[]args) throws InterruptedException {
		Demo2 demo = new Demo2();
		Demo3 de = new Demo3();
		
		demo.setDaemon(true);
		demo.start();
		demo.sleep(4000);
		de.start();
		
		System.out.println("hey..................................................");
	
	}

}
class Demo2 extends Thread{
	int count=2;
	public void run() {
		
		for(int i=0;i<100;i++) {
			System.out.println(i);
			count++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Demo3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"*");
		}
	}
}
