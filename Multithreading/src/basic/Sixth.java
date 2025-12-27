package basic;

public class Sixth {
	public static void main(String[] args) throws InterruptedException {
		Source source = new Source();
		Thread1 thread1 = new Thread1(source);
		Thread2 thread2 = new Thread2(source);

		thread2.start();
		//thread1.join();
		thread1.start();
		//thread2.join();
		System.out.println(source.counter());

	}

}

class Source {
	int count = 0;

	public int counter() {
		return this.count;

	}
}

class Thread1 extends Thread {
	Source source;
	public static int count = 0;

	public Thread1(Source source) {
		this.source = source;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			source.count++;
			count++;
		}
		System.out.println("Counter" + count);
	}
}

class Thread2 extends Thread {
	Source source;
	public static int count = 0;

	public Thread2(Source source) {
		this.source = source;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			source.count++;
			count++;
		}
		System.out.println("Counter" + count);
	}

}
