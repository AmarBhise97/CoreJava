package advance;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Seventh {
	public static void main(String[]args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++) {
			Bike b1 = new Bike(i);
			Future<Double> fu = ex.submit(b1);
			System.out.println(fu.get());
		}
		ex.shutdown();
	}

}
class Bike implements Callable<Double>{
	int id;
	public Bike(int id) {
		this.id=id;
	}
	
	public Double call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" Threading "+ this.id);
		Thread.sleep(200);
		return 88.88 +id;
	}
}
