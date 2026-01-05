package advance;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sixth {
	public static void main(String[]args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		for(int i =0;i<10;i++) {
			Car car = new Car(i);
			Future<Integer> ft = ex.submit(car);
			System.out.println(ft.get());
		}
		ex.shutdown();
		
	}

}
class Car implements Callable<Integer>
{
	int id;
	public Car(int id) {
		this.id=id;
		
	}
	
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" Threading "+this.id);
		Thread.sleep(1000);
		return 100+id;
	}
	
}
