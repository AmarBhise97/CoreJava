package advance;

public class Eight {
	public static void main(String[]args) throws InterruptedException {
		Bag bag =new Bag();
		
		
		bag.setDaemon(true);     //Daemon method.if demon method complete than terminate the main thread.
		//bydefault false.
		bag.start();
		Thread.sleep(1000);
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
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
}
