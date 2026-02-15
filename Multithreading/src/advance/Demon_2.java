package advance;

public class Demon_2 {
	public static void main(String[]args) throws InterruptedException {
		Demo1 demo = new Demo1();
		Demo2 de = new Demo2();
		
		demo.setDaemon(true);
		demo.start();
		demo.sleep(4);
		de.start();
		
		System.out.println("hey..................................................");
	
	}

}
class Demo1 extends Thread{
	int count=2;
	public void run() {
		
		for(int i=0;i<100;i++) {
			System.out.println(i);
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Demo2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"*");
		}
	}
}
