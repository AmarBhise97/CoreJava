package advance;

public class Eight {
	public static void main(String[]args) throws InterruptedException {
		Bag bag =new Bag();
		
		
		bag.setDaemon(true);     //Daemon method.
		bag.start();
		Thread.sleep(3000);
		System.out.println("Amar");
		
		
	}

}
class Bag extends Thread{
	int counter =1;
	public void run() {
		for(int i=0;i<50;i++) {
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
