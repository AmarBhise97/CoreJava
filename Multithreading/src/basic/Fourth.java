package basic;

public class Fourth {
	public static void main(String[] args) throws InterruptedException {
		Copy copy = new Copy();
		Entry entry = new Entry(copy);
		entry.start();
		entry.join();

	}

}

class Copy {
	int counter = 1;

	public int getCounter() {
		return this.counter;
	}
}

class Entry extends Thread {
	Copy copy;

	public Entry(Copy copy) {
		this.copy = copy;
	}

	public void run() {
		int sum =100;
		while(sum<1500) {
			this.copy.counter++;
			sum++;
		}
		System.out.println("total counter :"+ this.copy.counter);

	}
}
