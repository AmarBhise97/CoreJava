package basic;

public class Seventh {
	public static void main(String[] args) throws InterruptedException {
		Prime1 p1 = new Prime1();
		Prime_first pfis = new Prime_first(p1);
		Prime_second psec = new Prime_second(p1);
		pfis.setPriority(10);
		psec.setPriority(1);
		
		pfis.start();
		psec.start();
		
		Thread.sleep(1500);
		

	}

}

class Prime1 {
	int counter = 2;

	public  synchronized void count() {
		counter++;
	}

}

class Prime_first extends Thread {
	Prime1 p;

	public Prime_first(Prime1 p) {
		this.p = p;
	}

	public void run() {
		System.out.println(this.getName() + "Working Properly 1 :......");
		int counter = 1;
		while (counter < 1000) {
			p.count();
			counter++;
		}

	}

}

class Prime_second extends Thread {
	Prime1 p;

	public Prime_second(Prime1 p) {
		this.p = p;
	}

	public void run() {
		System.out.println(this.getName() + "Working Properly 2 : .......");
		int counter = 1;
		while (counter < 1000) {
			p.count();
			counter++;
		}

	}

}
